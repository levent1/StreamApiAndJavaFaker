package org.ltk;


import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

  public static void main(String[] args) {

    Faker faker = new Faker(new Locale("tr"));
    List<User> userList = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      User user = new User();
      user.setName(faker.name().firstName());
      user.setSurname(faker.name().lastName());
      user.setEmail(faker.internet().emailAddress());
      user.setPhone(faker.phoneNumber().phoneNumber());
      user.setAddress(faker.address().fullAddress());
      user.setAge(faker.number().numberBetween(18, 65));
      user.setJob(faker.job().title());
      userList.add(user);
    }

    // 1.Tüm verileri konsola yazdırınız.
    userList.stream().forEach(System.out::println);
    //2.En yaşlı birey kaç yaşındadır?
//    userList.stream()
//        .map(user->user.getAge())
//        .sorted(Comparator.reverseOrder())
//        .findFirst()// İlk değeri almak
//        .ifPresent(System.out::println);
//    userList.stream()
//        .max(Comparator.comparingInt(User::getAge))
//        .ifPresent(System.out::println);

    //3. Ankara'da yaşayan kaç kişi vardır?
//    long count= userList.stream()
//        .filter(user -> user.getAddress().contains("Ankara"))
//        .count();// Sayıyı buluyoruz
//    System.out.println(count);
    //4. İstanbul'da yaşayanların yaş ortalaması nedir?
//    double averageAge= userList.stream()
//        .filter(user -> user.getAddress().contains("İstanbul"))
//        .mapToInt(User::getAge) // Kullanıcıların yaşlarını almak
//        .average() // Ortalamayı buluyoruz
//        .orElse(0); // Eğer ortalamayı bulamadıysa 0 döndür
//    System.out.println(averageAge);
    //5. İsmi B ile başlayan kaç kişi vardır?
//    long count= userList.stream()
//        .filter(user -> user.getName().startsWith("B"))
//        .count();// Sayıyı buluyoruz
//    System.out.println(count);
    //6. İsmi B ile başlayanları listeden kaldırınız.
//    List<User> newList =new ArrayList<>();
//    newList=userList.stream()
//        .filter(user ->!user.getName().startsWith("B"))
//       .collect(Collectors.toList());// Yeni bir listeye kopyalıyoruz
//
//    newList.stream().forEach(user ->{
//      System.out.println(user);
//    });

    //7. İstanbul şehrinde yaşayan ve yaşı 35'ten büyük olan kişileri alfabetik olarak sıralayınız.
//    List<User> sortedUserList= userList.stream()
//        .filter(user -> user.getAddress().contains("İstanbul") && user.getAge()>35)
//        .sorted(Comparator.comparing(User::getName))
//        .collect(Collectors.toList());
//
//    sortedUserList.stream().forEach(user ->{
//      System.out.println(user.getName()+"/"+user.getAge());
//    });
    //8.Yaş aralıklarına (20-30, 31-40, 41 ve üzeri) göre kişileri listeleyiniz.
//    Map<String, List<String>> result = userList.stream()
//        .collect(Collectors.groupingBy(
//            user -> {
//              if (user.getAge() >= 20 && user.getAge() <= 30) {
//                return "20-30";
//              } else if (user.getAge() >= 31 && user.getAge() <= 40) {
//                return "31-40";
//              } else {
//                return "41+";
//              }
//            },
//            Collectors.mapping(User::getName, Collectors.toList())
//        ));
//
//    result.forEach((ageRange, names) -> {
//      System.out.println(ageRange + ": " + names+"/");
//    });

    //9.Telefon numarasının sonu 0 ile biten kişiler kimlerdir?
//    List<User> filteredUserList = userList.stream()
//       .filter(user -> user.getPhone().endsWith("0"))
//       .collect(Collectors.toList());
//
//    filteredUserList.stream().forEach(user -> {
//      System.out.println(user.getName() + "/" + user.getPhone());
//    });

//  //10.İsminin içinde "m" harfi olan ve yaşı 10'dan büyük olan kaç kişi vardır?
//  long count = userList.stream().filter(user ->{
//  return user.getName().toLowerCase().contains("m");})
//  .map(user -> {
//    long sum = 0;
//    System.out.println(user.getName() + "/" + user.getAge());
//    return sum;
//  }).count();
//    System.out.println(count);

    // Intermediate Operasyonlar:
//
//        .filter()       // Belirli bir koşula uyan elemanları filtrelemek için kullanılır
//        .map()          // Stream içindeki her elemanı dönüştürmek için kullanılır
//        .flatMap()      // İç içe Stream'leri düzleştirmek için kullanılır
//        .distinct()     // Yinelenen elemanları kaldırmak için kullanılır
//        .sorted()       // Stream elemanlarını sıralamak için kullanılır
//        .peek()         // Elemanları işlerken yan etki oluşturmak için kullanılır (debug amaçlı)
//        .limit()        // Stream'deki eleman sayısını sınırlamak için kullanılır
//        .skip()         // Belirli sayıda elemanı atlamak için kullanılır

// Terminal Operasyonlar:
//        .forEach()      // Her eleman üzerinde işlem yapmak için kullanılır
//        .toArray()      // Stream'i diziye dönüştürmek için kullanılır
//        .collect()      // Stream'i başka bir veri yapısına dönüştürmek için kullanılır
//        .reduce()       // Elemanları tek bir değere indirgemek için kullanılır
//        .min()          // En küçük elemanı bulmak için kullanılır
//        .max()          // En büyük elemanı bulmak için kullanılır
//        .count()        // Eleman sayısını hesaplamak için kullanılır
//        .anyMatch()     // Herhangi bir elemanın koşulu sağlayıp sağlamadığını kontrol etmek için kullanılır
//        .allMatch()     // Tüm elemanların koşulu sağlayıp sağlamadığını kontrol etmek için kullanılır
//        .noneMatch()    // Hiçbir elemanın koşulu sağlamadığını kontrol etmek için kullanılır
//        .findFirst()    // İlk elemanı bulmak için kullanılır
//        .findAny()      // Herhangi bir elemanı bulmak için kullanılır

  }
}
