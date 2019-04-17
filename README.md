# Veri Yapıları Örnekleri



[Örnek 1](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek01)

Alfabesi {0,1} olan ve  0^n 1^m 0^m 1^n kuralına uygun bir pushdown otomata yapısı oluşturulmuştur.Bu örnek kendisinie parametre olarak gelen bir String ifadenin pushdown otomata tarafından üretilip üretilmediğini kontrol eder.

[Örnek 2](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek02)

Radix sıralama algoritmasının kuyruk veri yapısı kullanılarak gerçekleştirilmesi.
		
[Örnek 3](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek03)

Bir ikili arama ağacında öğrencilerin numarası(int), adı(String) ve notu(int) tutuluyor. Ağaca ekleme işlemi numaraya göre yapılıyor.İkili arama ağacında ekleme, silme, arama, arama ağacında dolaşım (Preorder, inorder, postorder) ve ağacı gösterme metotlarını içeren sınıf tanımlandı.Kuyruk yapısı kullanılarak ikili arama ağacında lever-order (seviye seviye) dolaşma yapıldı.

[Örnek 4](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek04)

İki farklı Maximum Heap yapısını sıralayarak tek bir dizi haline getirir.

[Örnek 5](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek05)

Bir bağlı liste yapısı ile tek parametreye sahip bir polinom(Örneğin P(x)= x^3+3x^2+5x+10) tutuluyor. Bağlı listedeki her bir düğüm polinomun ilgili teriminin katsayısı ve derecesini tutmaktadır.

[Örnek 6](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek06)

Bağlı liste yapısı ile başa, sona, istenilen sıraya karakter ekleme ve çıkarma işlemleri yapılır.
		

[Örnek 7](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek07)

Verilen bir String ifadede parantezlerin eşli olup olmadığını yığıt yapısı kullanarak belirler. Örneğin parantezler ( { ( ) [ { } ] } ( ) ) şeklinde ise parantezler eşli olup doğru sırada parantezler açılmıştır. ( } ] ) ( ifadesi ise eşli olmayıp doğru sırada açılmamıştır. Verilen ifadede sadece  (,  {, [,  ), }, ] parantez işaretleri bulunmaktadır.  

[Örnek 8](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek08)

Yığıt kullanarak onluk tabandaki bir sayıyı ikilik tabana dönüştürme işlemi yapılıyor. Örneğin 233 sayısının 2’lik tabana dönüştürülmesi aşağıda verilmiştir.
			233/2 = 116 kalan =1  = push(1),
			116/2 = 58  kalan =0  = push(0),
			58/2  = 29  kalan =0  = push(0),
			29/2  = 14  kalan =1  = push(1),
			14/2  = 7   kalan =0  = push(0),
			7/2   = 3   kalan =1  = push(1),
			3/2   = 1   kalan =1  = push(1),
			1/2   = 0   kalan =1  = push(1).

[Örnek 9](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek09)

String olarak alınan bir infix ifade için yığıt kullanılarak infix ifadeyi postfix’e dönüştürme, infix ifadeyi prefix’e dönüştürme ve postfix ifadenin sonucunu hesaplama işlemleri yapılıyor.

[Örnek 10](https://github.com/sinemkrnz/Veri-Yapilari-Ornekleri/tree/master/src/Ornek10)

Round robin iş zamanlaması algoritmasında, işlerin büyüklükleri değişken olabilmektedir. Quantum(q) adı verilen belirli bir boyuttan büyük işlerin q büyüklüğü kadarlık kısmı tamamlanıp kalanı kuyruğun sonuna tekrar eklenmektedir. Büyüklüğü q dan küçük olan işler ise tamamlanıp kuyruktan tamamen silinir. 
İşlemci ’ye gelen işler sırasıyla 12 5 ve 18 olsun. Gelme sırasına göre işler kuyruğa eklenir. q=10 seçilirse her adımda kuyruk aşağıdaki gibi olur. 
			Adım 1: 12 5 8 /
			Adım 2: 5 18 2 (Kuyruğun başındaki işin 10 birimi yapıldı. Kalan 2 birim kuyruğun sonuna eklendi )/
			Adım 3: 18 2 /
			Adım 4: 2 8 /
			Adım 5: 8 /
			Adım 6: Boş/


