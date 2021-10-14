public class try_catch_finally {
    public static void main(String[] args) {
        //Bir metodu try-catch içine alamayız. Metodun içindeki bir işlemi içerisine alabilir.
        // Mesela şuanda main metodu içindeyiz. Ama direkt class içinde try-catch tanımlanamaz.
        int a = 0;
        int b = 20;

        try{
            System.out.println(b/a);
            System.out.println("Bölme işlemi yapıldı."); //Bunu yazmaz.
        }catch (Exception e){
            System.out.println(e.getMessage()); //Bunu yazar.
        }
        System.out.println("Program devam etti.");//Bunu yazar.

        /* //birçok catch blogu oluşturabilirz. Farklı hata türlerini yakalamak için.
        public int convertToInt(String numberAsText) {

		// bu örnekte hatayı tespit ediyoruz ve oluştuğu noktada önlemler alıyoruz.
		try {
			int number = Integer.parseInt(numberAsText);
			return number;
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			// bu kısımda mutlaka loglama yapmanız önerilir.
			// kurumsal projelerde hata takibi ve logların izlenmesi hataların çözümü için çok önemlidir.
		}
		catch (NullPointerException e) {
			// farklı hata tiplerine göre birden fazla catch bloğu açabilirsiniz.
			e.printStackTrace();
		}

		return -1;
	}
         */
        /*
        // hata olsun veya olmasın mutlaka çalıştırılır.
	finally
	{
		scanner.close();
	}
         */

    }
}
