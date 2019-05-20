# cmdSymulator

__Author__: Kamil Faliński

__About__: Simple example of decorator pattern.

__Instruction__: (in polish)
Z punktu widzenia systemu plików systemu operacyjnego, zapis dotyczący samego pliku jak i folderu (katalogu) jest dość podobny. Plik oraz katalog mają swoją nazwę, przy listowaniu zawartości dysku takie nazwy są wypisywane, niezależnie od tego, czy mamy doczynienia z plikiem czy folderem, przy czym nazwy folderów są w pewien sposób wyróżniane (proszę sprawdzić zlecenia listowania zawartości dysku/folderów w swoim ulubionym systemie operacyjnym). Foldery mogą zawierać w sobie pliki i/lub podfoldery. W analogiczny sposób można potraktować dysk, który ma swój literowy identyfikator oraz nazwę. Proszę zidentyfikować prosty wzorzec projektowy pozwalający na opisanie powyższych zależności oraz, z wykorzystaniem tego wzorca, napisać program pozwalający na:
Założenie hipotetycznego systemu plików, struktura może być zdefiniowana sztywno w programie (zapisana w kodzie). Proszę programowo zbudować przykładową strukturę.
Symulowanie „linii poleceń” — program ma pozwalać użytkownikowi na sprowadzanie poleceń typu dir, cd .., cd <nazwa podkatalogu>. A zatem użytkownik może poruszać się po zdefiniowanej strukturze dysku, mając możliwość przeglądania zawartości odwiedzanych katalogów. Zakładamy, że na starcie katalogiem domyślnym jest główny katalog symulowanego systemu plików.
