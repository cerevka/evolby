N�vod na instalaci p�vodn�ho projektu.

Na SVN do slo�ky trunk jsem nahr�l 6 netbeans projekt� - na�i aplikaci e-volby. 

Docela dob�e se to d� rozchodit pomoc� n�vodu, co n�m nechali u dokumentace - dal jsem to i do t�to slo�ky, 
jen p�r detail� jsem musel pozm�nit, aby mi to chodilo. 
Tak�e si podle n�vodu nainstalujete:

1. aplika�n� server Glassfish 2 
2. DB Mysql (p�i instalaci se nastavuje heslo - dejte "admin")
3. otev�ete si v NetBeans projekty, kter� jsem dal na SVN. 
4. V Services - Databases(kontext. menu) - Register MySQL server (vyplnit podle n�vodu login:root passwd:admin) 
5. V kontext. menu MySQL serveru vytvo��te 4 DB. Zept� se to v�dy jen na jm�no DB a ty jsou: ControllerDB, CounterDB, persondb, ValidatorDB. - p�esn� takle jak to p�u. Pro jistotu jsem svoje nastaven� DB je�te PrintScreenul.
6. Pokra�ujte podle n�vodu v tom kroku jak m�te deployovat jednotliv� moduly na server Glassfish. Modul je spr�vn� deploynut�, kdy� v p��slu�n� DB vytvo�� tabulky a na serveru je vid�t - tak jak je to v n�vodu.
7. Aplikace se spust� v Netbeans tak, �e spust�te modul EvolbyWeb2.


