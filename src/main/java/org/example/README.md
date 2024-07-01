## Java Junior (семинары)

### Урок 4. Базы данных и инструменты взаимодействия с ними

### Описание
- Создание базы данных MySQL и таблицы для хранения объектов определенного класса.
- Реализация доступа к базе данных с использованием JDBC и выполнение базовых операций CRUD.
- Создание сущности JPA для соответствующей таблицы базы данных.
- Использование Hibernate для работы с базой данных: чтение, запись, обновление и удаление записей.
<br><br>


### Домашняя работа

```

public class Homework {

  /**
   * Используя hibernate, создать таблицы:
   * 1. Post (публикация) (id, title)
   * 2. PostComment (комментарий к публикации) (id, text, post_id)
   * 
   * Написать стандартные CRUD-методы: создание, загрузка, удаление.
   * 
   * Доп. задания:
   * 1. * В сущностях post и postComment добавить поля timestamp с датами.
   * 2. * Создать таблицу users(id, name) и в сущностях post и postComment добавить ссылку на юзера.
   * 3. * Реализовать методы:
   * 3.1 Загрузить все комментарии публикации
   * 3.2 Загрузить все публикации по идентификатору юзера
   * 3.3 ** Загрузить все комментарии по идентификатору юзера
   * 3.4 **** По идентификатору юзера загрузить юзеров, под чьими публикациями он оставлял комменты.
   * // userId -> List<User>
   *   
   *  
   * Замечание: 
   * 1. Можно использовать ЛЮБУЮ базу данных (например, h2)
   * 2. Если запутаетесь, приходите в группу в телеграме или пишите мне @inchestnov в личку.
   */

}

```

#### Пример структуры каталогов проекта Maven:

```
project-root
|-- src
|   |-- main
|   |   |-- java
|   |   |   `-- (your Java packages and classes)
|   |   `-- resources
|   |       `-- hibernate.cfg.xml
`-- pom.xml

```

#### Проверка структуры проекта в IntelliJ IDEA:

- После выполнения этих шагов IntelliJ IDEA будет правильно включать содержимое папки src/main/resources в путь классов при сборке и запуске проекта.
```
1. Откройте структуру проекта:
    - Запустите IntelliJ IDEA и откройте ваш проект.
    - Перейдите в меню File > Project Structure, или используйте сочетание клавиш Ctrl + Alt + Shift + S.

2. Проверьте модули и источники:
    - В открывшемся окне Project Structure выберите раздел Modules в левой боковой панели.
    - В центральной панели выберите модуль, который хотите проверить.
    - Перейдите на вкладку Sources.

3. Проверьте папки ресурсов:
    - Во вкладке Sources увидите дерево каталогов вашего проекта.
    - Найдите папку src/main/resources. Она должна быть помечена синим цветом, что означает, что IntelliJ IDEA распознает её как папку ресурсов.
    - Если папка не помечена как Resources, можете кликнуть правой кнопкой мыши по папке и выбрать Mark Directory as > Resources Root.

4. Проверьте папки тестовых ресурсов:
    - Аналогично, если есть папка src/test/resources для тестовых ресурсов, убедитесь, что она также помечена как Test Resources Root.

5. Примените изменения:
    - Если внесены какие-либо изменения, нажмите OK или Apply для сохранения настроек.

6. Проверьте настройки сборки:
    - Если используете систему сборки Maven (или Gradle), убедитесь, что файлы pom.xml 9или build.gradle) находятся в корне проекта и корректно настроены.


```

#### Конфигурация сборки:
- В IntelliJ IDEA откройте вкладку Build > Build Project (или используйте сочетание клавиш Ctrl + F9), чтобы пересобрать ваш проект.
- После сборки откройте вкладку Project и перейдите к папке out или target, в зависимости от используемой системы сборки (Maven/Gradle).
- Разверните папку production и найдите папку, соответствующую вашему модулю.
- Внутри этой папки должна быть папка resources, содержащая все файлы из src/main/resources.