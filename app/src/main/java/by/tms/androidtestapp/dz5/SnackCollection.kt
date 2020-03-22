package by.tms.androidtestapp.dz5

class SnackCollection {
    val snacks = ArrayList<Snack>()
    var selectedSnack: Snack? = null

    companion object {
        val instance = SnackCollection()
    }

    fun fillTheList() {
        snacks.apply {
            add(
                Snack(
                    "Crab sticks",
                    "https://static.1000.menu/img/content/37198/ostrye-krabovye-palochki-objarennye-s-syrom_1564301481_7_max.jpg",
                    "Crab sticks for beer! “How corny, crab sticks!” - you think, looking at the next recipe, and I will tell you that you are wrong! As a child, many of us thought they were made from crabs. But even when they learned their real composition, they still bought and enjoyed eating. But even your favorite product is annoying if you do not diversify the recipe and do not experiment with the ingredients." +
                            "Believe me, we managed to breathe new life into our favorite crab sticks!"
                )
            )
            add(
                Snack(
                    "Onion rings",
                    "https://alimero.ru/uploads/images/00/61/14/2018/01/31/e258c1_wmark.jpg",
                    "Onion rings are usually served in beer in European countries. The history of this dish begins 100 years ago in the USA. They used to be served with fish or meat. And later they began to use it as an independent dish. Onion rings are a wonderful appetizer for light and dark beer."
                )
            )
            add(
                Snack(
                    "Lavash rolls with pepper",
                    "https://www.photorecept.ru/wp-content/uploads/2018/07/rolly-iz-lavasha-s-percem-zakuska-k-pivu-e1581863717500.jpg",
                    "Armenian lavash is mainly used for wrapping vegetables with salted cheese and herbs. Today we will prepare rolls of pita bread, only spicy, with sausage, for beer."
                )
            )
            add(
                Snack(
                    "Crispy Bacon Wrap Cheese and Chicken Fingers",
                    "https://www.koolinar.ru/all_image/recipes/137/137468/recipe_515cc05a-c506-4e0a-b097-e29196adde88_large.jpg",
                    "Crispy cheese and chicken fingers in bacon wrap! cool beer snack. I wrap the filling in pita bread, then wrap the fingers in bacon and fry."
                )
            )
            add(
                Snack(
                    "Carrots fries",
                    "https://alimero.ru/uploads/images/00/61/14/2018/04/28/0339e8_wmark.jpg",
                    "Have you tried deep-fried carrots? Great thing, I advise everyone! It is prepared quickly and not very troublesome. Suitable for beer or just a snack when you want something salty and crispy. It is an alternative to french fries, but differs in taste and cooking technology."
                )
            )
            add(
                Snack(
                    "SNACK FOR BEER FROM SAUSAGE AND CHEESE",
                    "https://www.1001eda.com/wp-content/uploads/2016/10/37MO189hyBM-e1476301549780.jpg",
                    "Great beer snack. Simple and quick to prepare dish. Please your man and he will say to you: “Thank you!” We are preparing a snack for beer from sausage and cheese!"
                )
            )
        }
    }

    fun selectSnack(position: Int) {
        if(position in 0 until snacks.size) selectedSnack = snacks[position]
    }
}