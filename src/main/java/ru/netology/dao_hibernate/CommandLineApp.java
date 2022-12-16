//package ru.netology.dao_hibernate;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import ru.netology.dao_hibernate.entity.Person;
//import ru.netology.dao_hibernate.entity.User;
//
//import java.util.List;
//import java.util.Random;
//import java.util.stream.IntStream;
//
//@Component
//@RequiredArgsConstructor
//public class CommandLineApp implements CommandLineRunner {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//
//
//        var cities = List.of("Moscow", "Rostov", "Kiev");
//        var names = List.of("Вася", "Петя", "Ваня", "Лёша", "Гриша");
//        var surname = List.of("Иванов", "Петров", "Смирнов", "Поляков", "Топиков");
//
//        var random = new Random();
//        IntStream.range(0, 100)
//                .forEach(i -> {
//                    var person = Person.builder()
//                            .user(User.builder()
//                                    .name(names.get(random.nextInt(names.size())))
//                                    .surname(surname.get(random.nextInt(surname.size())))
//                                    .age(random.nextInt(80))
//                                    .build())
//                            .phone_number(random.nextInt(999999))
//                            .city_of_living(cities.get(random.nextInt(cities.size())))
//                            .build();
//
//                    entityManager.persist(person);
//
//                });
//    }
//}
