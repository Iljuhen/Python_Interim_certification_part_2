## 1. Cоздайте две новых дирек тории – «Игрушки для школьников» и «Игрушки для дошколят» 

  >*-% mkdir Игрушки_для_школьников*

  >*-% mkdir Игрушки_для_дошколят*

## 2. Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»

  >*-% cd Игрушки_для_школьников*

  >*-% touch Роботы.txt*

  >*-% touch Конструктор.txt*

  >*-% touch Настольные игры.txt*

  >*-% cd ..*

## 3. Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»

  >*-% cd Игрушки_для_дошколят*

  >*-% touch Мягкие_игрушки.txt*

  >*-% touch Куклы.txt*

  >*-% touch Машинки.txt*

## 4. Объединить 2 директории в одну «Имя Игрушки»

  >*-% cd ..*

  >*-% mkdir Имя_игрушки*

  >*-% cp -rl Игрушки_для_школьников/* Игрушки_для_дошколят/* Имя_игрушки*

  >*-% tree Имя_игрушки*

  >*-% rm -rf Игрушки_для_школьников*

  >*-% rm -rf Игрушки_для_дошколят*

## 5. Переименовать директорию «Имя Игрушки» в «Игрушки»

  >*-% mv Имя_Игрушки* 

## 6. Просмотреть содержимое каталога «Игрушки».

  >*-% cd Имя_игрушки*
  >*-% ls -la*

## 7. Установить и удалить snap-пакет. (Любой, какой хотите)

  >*-% sudo snap install (имя пакета) - установка*
  >*-% sudo snap remove (имя пакета) - удаление*

## 8. Добавить произвольную задачу для выполнения каждые 3
минуты (Например, запись в текстовый файл чего-то или
копирование из каталога А в каталог Б).

  >-% crontab -e */3 * * * * echo 'Hello world' >> /home/User_Name/Игрушки/Роботы.txt*
(до-запись в файл каждые 3 минутs)