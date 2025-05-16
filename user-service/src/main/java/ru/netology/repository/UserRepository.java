package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.User;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {

    private final Map<Integer, User> users = Map.of(1, new User(1, "Хороков Павел Николаевич", "Бийск", "89237002030", "xorkov100@gmail.com"),
            2, new User(2, "Сычев Дмитрий Александрович", "Краснодар", "89377002030", "sychev100@gmail.com"),
            3, new User(3, "Маркин Андрей Александрович", "Бийск", "89375002030", "markin0@gmail.com"),
            4, new User(4, "Шамшина Дарья Александровна", "Бийск", "89376002030", "shamshina@gmail.com"),
            5, new User(5, "Дмитриев Александр Сергеевич", "Уральск", "89378002030", "dmitriev@gmail.com"),
            6, new User(6, "Горячев Александр Александрович", "Рязанск", "89379002030", "gorachev@gmail.com"),
            7, new User(7, "Лукьянова Виктория Александровна", "Бийск", "89370002030", "lukyanova@gmail.com"));

    public Optional<User> getUserById(int id) {
        return Optional.ofNullable(users.get(id));
    }
}
