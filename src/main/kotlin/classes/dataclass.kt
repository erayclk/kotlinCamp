package org.example.classes

//data classlarının kullanımı

//primary contsracteri mutlaka olmalı
//miras alınamıyor
//data classlarının parametreleri val yada var olmak zorunda

/*
Data class tanımlandığında, derleyici otomatik olarak equals(), hashCode(), toString(), copy() ve
componentN() fonksiyonlarını oluşturur. Bu, özellikle nesnelerin karşılaştırılması ve
kopyalanması işlemlerinde büyük kolaylık sağlar.
-amaç veri taşımak

constructırda verileri val yada var olark belirtmeliyiz
 */
data class dataclass(val name:String) {

}