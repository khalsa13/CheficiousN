package com.example.anshul.cheficiousn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i=new Intent();
        String from= getIntent().getStringExtra("source");
        if("Act1".equals(from))
        {
        s="\n" +
                "Tawa Aloo Masala \n" +
                "\n" +
                "Servings - 3 - 4\n" +
                "\n" +
                "INGREDIENTS\n" +
                "\n" +
                "Oil - 1 1/2 tablespoons\n" +
                "Boiled potatoes - 500 grams\n" +
                "Salt - 1 teaspoon\n" +
                "Turmeric - 1/4 teaspoon\n" +
                "Red chili powder - 1/2 teaspoon\n" +
                "Coriander powder - 1 teaspoon\n" +
                "Chaat masala powder - 1/2 teaspoon\n" +
                "Oil - 2 teaspoons\n" +
                "Cumin seeds - 1/2 teaspoon\n" +
                "Onions - 70 grams\n" +
                "Ginger paste -1/2 teaspoon\n" +
                "Garlic paste - 1/2 teaspoon\n" +
                "Tomato puree - 180 milliliters\n" +
                "Garam masala powder - 1/2 teaspoon\n" +
                "Fenugreek - 1/2 teaspoon\n" +
                "Coriander - for garnishing\n" +
                "\n" +
                "PREPARATION \n" +
                "\n" +
                "1. Heat 1 1/2 teaspoons oil in a heavy skillet, add 500 grams boiled potatoes, 1 teaspoon salt, 1/4 teaspoon turmeric, 1/2 teaspoon red chili, 1 teaspoon coriander, 1/2 teaspoon chaat masala and mix well. Fry the potatoes on a medium heat. Once the potatoes turn brown, remove from heat.\n" +
                "2. Heat 2 teaspoons oil in heavy skillet, add 1/2 teaspoon cumin seeds, 70 grams onions, 1/2 teaspoon ginger and 1/2 teaspoon garlic and saute till onions turn brown.\n" +
                "3. Add 180 milliliters tomato puree and stir, cook on a medium heat for 2 minutes.\n" +
                "4. Add fried potatoes, 1/2 teaspoon garam masala, 1/2 teaspoon fenugreek and mix well. Cook for 4 -5 minutes on a medium heat.\n" +
                "5. Garnish with coriander.\n" +
                "6. Serve hot\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act2".equals(from))
        {
            s="Mushroom Masala\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Oil - 3 tablespoons\n" +
                    "Mustard seeds - 1/2 teaspoon\n" +
                    "Cumin seeds - 1 teaspoon\n" +
                    "Curry leaves - 8\n" +
                    "Green chili - 2\n" +
                    "Onions - 70 grams\n" +
                    "Ginger garlic paste - 2 teaspoons\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Cumin powder - 1 teaspoon\n" +
                    "Garam Masala - 1 teaspoon\n" +
                    "Coriander powder - 2 teaspoons\n" +
                    "Red chili - 2 teaspoons\n" +
                    "Turmeric - 1/4 teaspoon\n" +
                    "Tomato puree - 130 milliliters\n" +
                    "Bell pepper - 160 grams\n" +
                    "Mushrooms - 250 grams\n" +
                    "Butter - 2 tablespoons\n" +
                    "Green chili - 2\n" +
                    "Garlic - 1 tablespoon\n" +
                    "Curry leaves - 4\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 3 tablespoons oil in a heavy skillet, add 1/2 teaspoon mustard seeds, 1 teaspoon cumin seeds, 8 curry leaves, 2 green chili and stir.\n" +
                    "2. Add 70 grams onions, 2 teaspoons ginger garlic paste and sauce them till it becomes translucent.\n" +
                    "3. Add 1/2 teaspoon salt, 1 teaspoon cumin powder, 1 teaspoon garam masala, 2 teaspoons coriander powder, 2 teaspoons red chili, 1/4 teaspoon turmeric and mix well.\n" +
                    "4. Add 130 millilitres tomato puree and mix it again.\n" +
                    "5. Add 160 grams bell pepper, 250 grams mushrooms and toss well. Cover it with lid and cook for 7 - 10 minutes.\n" +
                    "6. Take a pan, add 2 tablespoons butter, 2 green chili, 1 tablespoon garlic, 4 curry leaves and stir well.\n" +
                    "7. Add this into the mushrooms and mix well.\n" +
                    "8. Garnish with coriander.\n" +
                    "9. Serve\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);        }
        else if("Act3".equals(from))
        {
            s="Bharva Baingan\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Eggplant - 400 grams\n" +
                    "Green chili - 1 teaspoon\n" +
                    "Garlic paste - 2 tablespoons\n" +
                    "Ginger paste - 2 tablespoons\n" +
                    "Red chili - 1 teaspoon\n" +
                    "Turmeric - 1/2 teaspoon\n" +
                    "Salt - 2 teaspoons\n" +
                    "Garam masala - 1 teaspoon\n" +
                    "Coriander - 1 teaspoon\n" +
                    "Fennel seeds - 2 teaspoons\n" +
                    "Oil - 2 tablespoons\n" +
                    "Cumin - 1 teaspoon\n" +
                    "Curry leaves - 10\n" +
                    "Onions - 175 grams\n" +
                    "Tomato - 175 grams\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Slit the eggplant in the centre and keep aside.\n" +
                    "2. Take bowl, add 1 teaspoon green chili, 2 tablespoons garlic paste, 2 tablespoons ginger paste, 1 teaspoon red chili, 1/2 teaspoon turmeric, 2 teaspoons salt, 1 teaspoon garam masala, 1 teaspoon coriander, 2 teaspoons fennel seeds and mix well to combine.\n" +
                    "3. Stuffed the eggplant with spice powder mixture evenly. Keep all the stuffed eggplant aside.\n" +
                    "4. Heat 2 tablespoons oil in a heavy skillet, add 1 teaspoon cumin, 10 curry leaves and stir well.\n" +
                    "5. Add 175 grams onions and fry till translucent.\n" +
                    "6. Now, add 175 grams tomato and saute for few minutes.\n" +
                    "7. Add the remaining spice powder mixture and the stuffed eggplant in it.\n" +
                    "8. Mix it well and turn around a few times on high heat.\n" +
                    "9. Cover it with a lid and cook for 10 - 15 minutes.\n" +
                    "10. Serve hot\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act4".equals(from))
        {
            s="Corn Pulao\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Onions - 90 grams\n" +
                    "Ginger - 1 tablespoon\n" +
                    "Garlic - 2 cloves\n" +
                    "Green chili - 1\n" +
                    "Mint - 6 grams\n" +
                    "Ghee - 2 tablespoons\n" +
                    "Bay leaf - 1\n" +
                    "Cinnamon stick - 1 inch\n" +
                    "Cardamom - 2 - 3\n" +
                    "Cloves - 2 - 3\n" +
                    "Caraway seeds - 1 teaspoon\n" +
                    "Turmeric - 1/4 teaspoon\n" +
                    "Garam masala - 1/2 teaspoon\n" +
                    "Red chili - 1/2 teaspoon\n" +
                    "Sweet corn - 125 grams\n" +
                    "Green peas - 70 grams\n" +
                    "Soaked rice - 300 grams\n" +
                    "Water - 500 milliliters\n" +
                    "Salt - 1 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a bowl, add 90 grams onions, 1 tablespoon ginger, 2 cloves of garlic, 1 green chili, 6 grams mint and blend it into a smooth paste.\n" +
                    "2. Heat 2 tablespoons ghee in a heavy skillet, add 1 bay leaf, 1 inch cinnamon stick, 2 - 3 cardamoms, 2 - 3 cloves, 1 teaspoon caraway seeds and stir well.\n" +
                    "3. Add the onion mint paste in it and stir again.\n" +
                    "4. Now, add 1/4 teaspoon turmeric, 1/2 teaspoon garam masala, 1/2 teaspoon red chili and mix well.\n" +
                    "5. Add 125 grams sweet corn, 70 grams green peas and stir well.\n" +
                    "6. Then, add 330 grams soaked rice, 500 milliliters water, 1 teaspoon salt and mix well.\n" +
                    "7. Cover it with a lid and cook for 20 minutes or till the rice are cooked.\n" +
                    "8. Serve hot\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act5".equals(from))
        {
            s="Dal Makhni\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Whole black gram (sabut urad) 1/2 cup\n" +
                    "Red kidney beans (rajma) 2 tablespoons\n" +
                    "Salt to taste\n" +
                    "Red chilli powder 1 teaspoon\n" +
                    "Ginger chopped2 inch pieces\n" +
                    "Nutralite Butter 3 tablespoons\n" +
                    "Oil 1 tablespoon\n" +
                    "Cumin seeds 1 teaspoon\n" +
                    "Garlic chopped6 cloves\n" +
                    "Onion chopped1 large\n" +
                    "Green chillies slit2 \n" +
                    "Tomatoes 2 medium\n" +
                    "Garam masala powder 1 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Pick, wash and soak sabut urad and rajma overnight in three cups of water. Drain. \n" +
                    "2. Boil sabut urad and rajma in three cups of water with salt and half the red chilli powder (you can add half the ginger too if you wish) for three whistles in a pressure cooker. Open the lid and see if the rajma is totally soft. If not cook on low heat till the rajma becomes totally soft.\n" +
                    "3. Heat butter and oil in a pan. Add cumin seeds. When they begin to change colour, add ginger, garlic and onion and sauté till golden. \n" +
                    "4. Add slit green chillies, tomatoes and sauté on high heat. Add the remaining red chilli powder and sauté till the tomatoes are reduced to a pulp. \n" +
                    "5. Add the cooked dal and rajma along with the cooking liquour. Add some water if the mixture is too thick. Add garam masala powder and adjust salt. \n" +
                    "6. Simmer on low heat till the dals are totally soft and well blended. \n" +
                    "7. Serve hot. \n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act6".equals(from))
        {
            s="Bharva Bhindi\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Oil - 1 tablespoon\n" +
                    "Onions - 65 grams\n" +
                    "Turmeric - 1/4 teaspoon\n" +
                    "Coriander powder - 1 tablespoon\n" +
                    "Red chili - 1 teaspoon\n" +
                    "Salt - 1 teaspoon\n" +
                    "Gram flour - 30 grams\n" +
                    "Mustard oil - 1 teaspoon\n" +
                    "Okra - 300 grams\n" +
                    "Oil - 1 tablespoon\n" +
                    "Cumin - 1 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 1 tablespoon oil in a pan, add 65 grams onions and fry till translucent.\n" +
                    "2. Add 1/4 teaspoon turmeric and stir well.\n" +
                    "3. Now, add 1 tablespoon coriander powder, 1 teaspoon red chili, 1 teaspoon salt and mix well.\n" +
                    "4. Add 30 grams gram flour and roast it for 2 minutes till nice aroma starts to come.\n" +
                    "5. Add 1 teaspoon mustard oil and mix well.\n" +
                    "6. Take 300 grams okra, slice off the crown and base of each bhindi and cut it into half.\n" +
                    "7. Take each okra and stuff it with prepared masala. Repeat the same process for stuffing. Keep aside.\n" +
                    "8. Heat 1 tablespoon oil in a pan, add 1 teaspoon cumin and stir well.\n" +
                    "9. Add the stuffed okra in it and mix it well.\n" +
                    "10. Cover it with a lid and cook for 2 - 3 minutes on medium heat.\n" +
                    "11. Open the lid and stir well.\n" +
                    "12. Again cover it with a lid and cook for 2 - 3 minutes on medium heat.\n" +
                    "13. Open the lid and stir well again.\n" +
                    "14. Serve hot\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act7".equals(from))
        {
            s="Kadai Paneer\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "(Dry Spices)\n" +
                    "Coriander - 1 tablespoon\n" +
                    "Cumin - 1 teaspoon\n" +
                    "Fennel seeds - 1 teaspoon\n" +
                    "Cloves - 2\n" +
                    "Cardamom - 2 pods\n" +
                    "Peppercorns - 4\n" +
                    "\n" +
                    "(Saute)\n" +
                    "Oil - 1 tablespoon\n" +
                    "Onions - 110 grams\n" +
                    "Tomato - 100 grams\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "\n" +
                    "(Gravy)\n" +
                    "Butter - 1 tablespoon\n" +
                    "Ginger paste - 1 teaspoon\n" +
                    "Garlic paste - 1 teaspoon\n" +
                    "Green chili - 2\n" +
                    "Onions - 75 grams\n" +
                    "Bell pepper - 80 grams\n" +
                    "Cashew paste - 2 tablespoons\n" +
                    "Dry mango powder - 1 teaspoon\n" +
                    "Water - 200 milliliters\n" +
                    "Paneer - 250 grams\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "(Dry Spices)\n" +
                    "1. Add 1 tablespoon coriander seeds, 1 teaspoon cumin seeds, 1 teaspoon fennel seeds, 2 cloves, 2 pods cardamom, 4 peppercorns in a pan and roast for a minute.\n" +
                    "2. Let the mixture cool and put it into a blender and blend it to make a smooth powder.\n" +
                    "\n" +
                    "(Saute)\n" +
                    "1. Heat 1 tablespoon oil in a pan, 110 grams onions and saute until the onions are golden brown.\n" +
                    "2. Add 100 grams tomato, 1/2 teaspoon salt and cook it till the tomatoes turn soft.\n" +
                    "3. Transfer it into a blender and blend it to make a smooth paste.\n" +
                    "\n" +
                    "(Gravy)\n" +
                    "1. Heat 1 tablespoon butter in a pan, add 1 teaspoon ginger paste, 1 teaspoon garlic paste and saute for a minute.\n" +
                    "2. Add 2 green chili, 75 grams onions, 80 grams bell pepper and mix well. Cook for 3 - 5 minutes.\n" +
                    "3. Add the onions and tomato paste paste in it and mix well. Add 2 tablespoons cashew paste, dry spices powder, 1 teaspoon dry mango powder and mix well.\n" +
                    "4. Add 200 milliliters water and stir well. Let it boil.\n" +
                    "5. Add 250 grams paneer, 1/2 teaspoon salt and mix well.\n" +
                    "6. Serve hot with roti or naan\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act8".equals(from))
        {
            s="White Sauce Pasta\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 500 milliliters\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Oil - 1/2 teaspoon\n" +
                    "Pasta - 90 grams\n" +
                    "Butter - 1 tablespoon\n" +
                    "Carrot - 40 grams\n" +
                    "Bell pepper - 40 grams\n" +
                    "Green peas - 40 grams\n" +
                    "Sweet corn - 40 grams\n" +
                    "Butter - 1 tablespoon\n" +
                    "All purpose flour - 1 tablespoon\n" +
                    "Milk - 350 milliliters\n" +
                    "Processed cheese - 2 tablespoons\n" +
                    "Oregano - 1/4 teaspoon\n" +
                    "Black pepper - 1/4 teaspoon\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 500 milliliters water in a frying pan, add 1/2 teaspoon salt, 1/2 teaspoon oil and mix well.\n" +
                    "2. Add 90 grams pasta and cook until soften. Drain and keep aside.\n" +
                    "3. Heat 1 tablespoon butter in a pan, add 40 grams carrot, 40 grams bell pepper, 40 grams green peas, 40 grams sweet corn and saute the veggies for 5 - 7 minutes. Transfer them into a bowl and keep aside.\n" +
                    "4. Heat 1 tablespoon butter in a another pan, add 1 tablespoon all purpose flour and saute till raw smell goes.\n" +
                    "5. Add 350 milliliters milk, stir well and make it lump free.\n" +
                    "6. Boil on low heat until thick.\n" +
                    "7. Add 2 tablespoons processed cheese, 1/4 teaspoon oregano, 1/4 teaspoon black pepper and mix well.\n" +
                    "8. Add 1/2 teaspoon salt and mix well.\n" +
                    "9. Now, add the cooked veggies and boiled pasta in it.\n" +
                    "10. Mix all the ingredients well.\n" +
                    "11. Serve\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act9".equals(from))
        {
            s="Achari Roll\n" +
                    "\n" +
                    "Servings - 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Wheat flour - 300 grams\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Achari masala - 1 tablespoon\n" +
                    "Water - 200 milliliters\n" +
                    "Butter - 1 tablespoon\n" +
                    "Mustard - 1 teaspoon\n" +
                    "Pumpkin - 170 grams\n" +
                    "Green peas - 80 grams\n" +
                    "Boiled potatoes - 230 grams\n" +
                    "Turmeric - 1/2 teaspoon\n" +
                    "Red chili - 1/2 teaspoon\n" +
                    "Garam masala - 1/2 teaspoon\n" +
                    "Asafoetida - 1/4 teaspoon\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Achari masala - 2 teaspoons\n" +
                    "Water - 1 tablespoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 300 grams wheat flour, 1/2 teaspoon salt, 1 tablespoon achari masala, 200 milliliters water and knead it into a smooth soft dough. Keep aside.\n" +
                    "2. Heat 1 tablespoon butter in a heavy skillet, add 1 teaspoon mustard and stir. Add 170 grams pumpkin, 80 grams green peas, 230 grams boiled potatoes and mix well.\n" +
                    "3. Add 1/2 teaspoon turmeric, 1/2 teaspoon red chili, 1/2 teaspoon garam masala, 1/4 teaspoon asafoetida, 1/2 teaspoon salt and mix well. Cook for 8 - 10 minutes.\n" +
                    "4. Take the dough and divide into equal sized balls. Take a ball and press it between the palms of your hands. Dust both the sides of the dough ball. Roll the dough ball into a round and thin paratha.\n" +
                    "5. Heat a Tava or skillet. Cook the rolled paratha till it turns golden brown on both the sides.\n" +
                    "6. Take 2 teaspoons achari masala, 1 tablespoon water and mix well.\n" +
                    "7. To Prepare Rolls, take a cooked paratha and spread achari masala over it.\n" +
                    "8. Stuff it with potato and pumpkin mixture. Close both the sides of paratha and seal the top with a toothpick.\n" +
                    "9. Serve\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act10".equals(from))
        {
            s="Stuffed Bun \n" +
                    "\n" +
                    "Servings - 3- 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Milk - 80 milliliters\n" +
                    "Sugar - 1 tablespoon\n" +
                    "Dry yeast - 3/4 tablespoon\n" +
                    "All purpose flour - 200 grams\n" +
                    "Oil - 40 milliliters\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Water - 70 milliliters\n" +
                    "Oil - 1 teaspoon\n" +
                    "Cumin - 1 teaspoon\n" +
                    "Onions - 30 grams\n" +
                    "Green beans - 25 grams\n" +
                    "Carrot - 30 grams\n" +
                    "Cabbage - 30 grams\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Red chili - 1/4 teaspoon\n" +
                    "Turmeric - 1/8 teaspoon\n" +
                    "Garam masala - 1/4 teaspoon\n" +
                    "Lemon juice - 1 teaspoon\n" +
                    "Mozzarella cheese - 40 grams\n" +
                    "Black sesame seeds - for garnishing\n" +
                    "White sesame seeds - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Add 1 tablespoon sugar in 80 milliliters of milk and stir. Add 3/4 tablespoon dry yeast and mix it well. Keep aside for 5 minutes.\n" +
                    "2. In a mixing bowl, add 200 grams all purpose flour, 40 milliliters oil, 1/2 teaspoon salt, 70 milliliters water and the yeast mixture. Mix and make a smooth soft dough.\n" +
                    "3. Cover for 1 hour.\n" +
                    "4. Heat 1 teaspoon oil in a pan, add 1 teaspoon cumin and stir. Add 30 grams onions and cook until they are translucent.\n" +
                    "5. Add 25 grams green beans, 30 grams carrot, 30 grams cabbage and cook until tender.\n" +
                    "6. Add 1/2 teaspoon salt, 1/4 teaspoon red chili, 1/8 teaspoon turmeric, 1/4 teaspoon garam masala and mix well.\n" +
                    "7. Transfer this mixture into a bowl, add 1 teaspoon lemon juice, 40 grams mozzarella cheese and mix well.\n" +
                    "8. Take a bun dough and make a dent in middle and fill with vegetable stuffing. Bring the edges together, pinching with fingers and then smoothen the balls to give an even look.\n" +
                    "9. Arrange them on baking tray.\n" +
                    "10. Sprinkle sesame seeds on each stuffed dough ball.\n" +
                    "11. Preheat the oven to 375°F/190°C. Bake for 20 - 25 minutes or until the crust turns golden brown.\n" +
                    "12. Serve hot with ketchup\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act11".equals(from))
        {
            s="Kala Chana Curry\n" +
                    "\n" +
                    "Servings - 2 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Brown chickpeas - 200 grams\n" +
                    "Water\n" +
                    "Bay leaf - 1\n" +
                    "Salt - 1 teaspoon\n" +
                    "Cinnamon stick - 1 inch\n" +
                    "Clove - 1\n" +
                    "Cardamom - 1\n" +
                    "Oil - 1 tablespoon\n" +
                    "Onions - 100 grams\n" +
                    "Green chili - 1 teaspoon\n" +
                    "Cumin - 1/2 teaspoon\n" +
                    "Fennel - 1/2 teaspoon\n" +
                    "Water - 2 tablespoons\n" +
                    "Oil - 2 tablespoons\n" +
                    "Onions - 60 grams\n" +
                    "Asafoetida - 1/4 teaspoon\n" +
                    "Ginger paste - 2 teaspoons\n" +
                    "Red chili - 1 1/2 teaspoons\n" +
                    "Coriander seeds - 1 1/2 teaspoons\n" +
                    "Turmeric - 1/2 teaspoon\n" +
                    "Tomato puree - 200 milliliters\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Garam masala - 1 teaspoon\n" +
                    "Dry mango powder - 1/2 teaspoon\n" +
                    "Coriander - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 200 grams brown chickpeas, water and soak for overnight.\n" +
                    "2. Add 200 grams soaked brown chickpeas, 1 bay leaf, 1 teaspoon salt, 1 inch cinnamon stick, 1 clove, 1 cardamom and bring it to a boil. Keep aside.\n" +
                    "3. Heat 1 tablespoon oil in a pan, add 100 grams onions and stir.\n" +
                    "4. Add onions, 1 teaspoon green chili, 1/2 teaspoon cumin, 1/2 teaspoon fennel, 2 tablespoons water in a blender and blend it into a puree.\n" +
                    "5. Heat 2 tablespoons oil in a another pan, add 60 grams onions, 1/4 teaspoon asafoetida, 2 teaspoons ginger paste and stir well.\n" +
                    "6. Add onions mixture in it and mix well.\n" +
                    "7. Add 1 1/2 teaspoons red chili, 1 1/2 teaspoons coriander seeds, 1/2 teaspoon turmeric and stir.\n" +
                    "8. Add 200 milliliters tomato puree and mix well.\n" +
                    "9. Add this mixture into the brown chickpeas mixture and mix well.\n" +
                    "10. Add 1/2 teaspoon salt and mix well. Bring it to a boil.\n" +
                    "11. Add 1 teaspoon garam masala, 1/2 teaspoon dry mango powder and mix it well.\n" +
                    "12. Cover it with lid and cook for about 10 minutes.\n" +
                    "13. Garnish with coriander.\n" +
                    "14. Serve\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act12".equals(from))
        {
            s="Chatpati Masoor Dal\n" +
                    "\n" +
                    "Servings - 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 1 litre\n" +
                    "Whole red lentils - 220 grams\n" +
                    "Salt - 1 teaspoon\n" +
                    "Turmeric - 1 teaspoon\n" +
                    "Dry mango powder - 2 teaspoons\n" +
                    "Ghee - 3 tablespoons\n" +
                    "Cumin seeds - 1 teaspoon\n" +
                    "Dry red chili - 2\n" +
                    "Onions - 100 grams\n" +
                    "Asafoetida - 1/4 teaspoon\n" +
                    "Green chili - 1 1/2 teaspoons\n" +
                    "Tomato - 110 grams\n" +
                    "Red chili powder -1 teaspoon\n" +
                    "\n" +
                    "PREPARATION \n" +
                    "\n" +
                    "1. Wash the whole red lentil thoroughly and drain the water.\n" +
                    "2. Pour 1 litre water in a skillet, add 220 grams whole red lentils, add 1 teaspoon salt, 1 teaspoon turmeric and mix well.\n" +
                    "3. Boil the dal till done.\n" +
                    "4. Add 2 teaspoons dry mango powder in the dal and mix well.\n" +
                    "5. Take a pan and add 3 tablespoons ghee, 1 teaspoon cumin seeds, 2 dry red chili, 100 grams onions, 1/4 teaspoon asafoetida, 1 1/2 teaspoon green chili, and fry till golden brown.\n" +
                    "6. Add 110 grams tomato, 1 teaspoon red chili powder and cook for few seconds.\n" +
                    "7. Transfer the mixture over the dal and mix well\n" +
                    "8. Garnish with coriander leaves.\n" +
                    "9. Serve hot with rice\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act13".equals(from))
        {
            s="\n" +
                    "Moong Dal Halwa\n" +
                    "\n" +
                    "Servings 3 – 4\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 220 millilitres\n" +
                    "Sugar - 230 grams\n" +
                    "Cardamom - 2/3 teaspoon\n" +
                    "Warm milk - 2tablespoons\n" +
                    "Saffron - 1/8 teaspoon\n" +
                    "Split mung beans - 200 grams\n" +
                    "Ghee - 1 tablespoon\n" +
                    "Almonds - 2 tablespoons\n" +
                    "Cashews - 2 tablespoons\n" +
                    "Ghee - 100 grams\n" +
                    "Milk - 220 millilitres\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Boil 220 milliliters water in a pan , add 230 grams sugar, 2/3 teaspoon cardamom and then sugar syrup will start to boil.\n" +
                    "2. In a mixing bowl, add 2 tablespoons warm milk, 1/8 teaspoon saffron and mix well.\n" +
                    "3. Wash 200 grams split mung beans and strain the water.\n" +
                    "4. Heat a pan, add washed split mung beans and dry roast the dal on low heat till it become golden brown.\n" +
                    "5. Transfer it to a blender and blend it until smooth and fine powder.\n" +
                    "6. Heat 1 tablespoon ghee in a pan, add 2 tablespoons almonds, 2 tablespoons cashews and roast on low heat.\n" +
                    "7. Heat 100 grams ghee on a heavy skillet, add roasted dal powder and stir well.\n" +
                    "8. Add 220 milliliters milk and stir continuously on low heat.\n" +
                    "9. Add saffron milk and mix well.\n" +
                    "10. When the dal absorbs the milk entirely, add sugar syrup and mix it.\n" +
                    "11. Add roasted dry fruits and mix.\n" +
                    "12. Let it boil, Cook it on low to medium heat for 3 - 5 minutes.\n" +
                    "13. Garnish with crushed almonds.\n" +
                    "14. Serve\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act14".equals(from))
        {
            s=      "Bread Malpua\n" +
                    "\n" +
                    "Servings 3 – 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 400 milliliters\n" +
                    "Sugar - 200 grams\n" +
                    "Cardamom powder - 1/2 teaspoon\n" +
                    "Saffron - 1/8 teaspoon\n" +
                    "Lemon juice - 1/2 teaspoon\n" +
                    "Bread slice\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 400 millilitres water, add 200 grams sugar, 1/2 teaspoon cardamom powder, 1/8 teaspoon saffron and stir well.\n" +
                    "2. Add 1/2 teaspoon lemon juice and then sugar syrup will start to boil.\n" +
                    "3. Take a bread slice and cut out heart shaped slice from the bread.\n" +
                    "4. Heat sufficient oil in a heavy skillet. Deep fry until crispy and golden brown.\n" +
                    "5. Drain and immerse in the sugar syrup.\n" +
                    "6. Garnish with pistachios.\n" +
                    "7. Serve.\n" +
                    "\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act15".equals(from))
        {
            s="Eggless Brownies\n" +
                    "\n" +
                    "Servings - 4 - 5\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Dark chocolate - 240 grams\n" +
                    "Water - 190 milliliters\n" +
                    "Butter - 150 grams\n" +
                    "Powdered sugar - 40 grams\n" +
                    "Vanilla extract - 1 teaspoon\n" +
                    "Condensed milk - 400 grams\n" +
                    "All purpose flour - 280 grams\n" +
                    "Baking powder - 2 teaspoons\n" +
                    "Baking soda - 1 teaspoon\n" +
                    "Walnuts - to taste\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a pan, add 240 grams dark chocolate, 190 milliliters water and heat until the chocolate melts. Stir well to get a smooth sauce and keep aside to cool.\n" +
                    "2. In a mixing bowl, add 150 grams butter, 40 grams powdered sugar and beat well until smooth and creamy.\n" +
                    "3. Add 1 teaspoon vanilla extract, 400 grams condensed milk and beat again for 3 - 5 minutes.\n" +
                    "4. Then add the melted chocolate in it and mix it again.\n" +
                    "5. Now, add 280 grams all purpose flour, 2 teaspoons baking powder, 1 teaspoon baking soda and beat well until all the flour is mixed into the liquid.\n" +
                    "6. Pour the batter into the baking dish and make the batter uniform. Scatter walnuts over it.\n" +
                    "7. Preheat the oven to 350°F/180°C. Bake for 40 minutes.\n" +
                    "8. Cut it into desired shape.\n" +
                    "9. Serve\n";
            TextView t=(TextView)findViewById(R.id.Act1);
            t.setText(s);
        }

        else if("Act16".equals(from)) {
            s =     "Besan Barfi\n" +
                    "\n" +
                    "Servings - 5 – 7\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Ghee - 190 milliliters\n" +
                    "Gram flour - 200 grams\n" +
                    "Semolina - 80 grams\n" +
                    "Powdered sugar - 150 grams\n" +
                    "Cardamom powder - 1/2 teaspoon\n" +
                    "Pistachios - for garnishing\n" +
                    "Almonds - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 190 milliliters ghee in a heavy skillet, add 200 grams gram flour, 80 grams semolina and saute on low heat, stirring continuously, for 10 - 15 minutes or till it starts changing color and is fragrant.\n" +
                    "2. Now, add 150 grams powdered sugar, 1/2 teaspoon cardamom powder and mix well.\n" +
                    "3. Pour the gram flour mixture into the tray and spread it evenly with a greased spatula.\n" +
                    "4. Rest for 2 hours and cut it into desired shape.\n" +
                    "5. Serve or store the buffi in an airtight container.\n" +
                    "\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        }
        else if("Act17".equals(from)) {
            s =                     "Gujiya\n" +
                    "\n" +
                    "Servings - 4 - 5\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "All purpose flour - 120 grams\n" +
                    "Whole wheat flour - 120 grams\n" +
                    "Salt - 1/4 teaspoon\n" +
                    "Ghee - 50 milliliters\n" +
                    "Water - 150 milliliters\n" +
                    "Mawa - 200 grams\n" +
                    "Desiccated coconut - 30 grams\n" +
                    "Powdered sugar - 80 grams\n" +
                    "Almonds - 30 grams\n" +
                    "Cashews - 30 grams\n" +
                    "Raisins - 30 grams\n" +
                    "Cardamom powder - 1/4 teaspoon\n" +
                    "Water\n" +
                    "Ghee - for brushing\n" +
                    "Silver leaves\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 120 grams all purpose flour, 120 grams whole wheat flour, 1/4 teaspoon salt, 50 milliliters ghee, 150 milliliters water and knead it into a smooth soft dough.\n" +
                    "2. Rest the dough for 30 minutes.\n" +
                    "3. Take a pan, add 200 grams khoa and cook till it becomes soft and comes together. Let the khoa cool down to room temperature.\n" +
                    "4. Transfer this into a bowl, add 30 grams desiccated coconut, 80 grams powdered sugar, 30 grams almonds, 30 grams cashews, 30 grams raisins, 1/4 teaspoon cardamom powder and mix all the ingredients well.\n" +
                    "5. Take a medium sized ball from dough and flatten them with a rolling pin.\n" +
                    "6. Cut out circle from it. Apply some water on the edges.\n" +
                    "7. Fill it with khoa filling and seal the edges making sure there are no air bubbles.\n" +
                    "8. Place them on a baking tray and brush it with ghee.\n" +
                    "9. Preheat the oven to 400°F/200°C. Bake for 15 - 20 minutes.\n" +
                    "10. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act18".equals(from)) {
            s = "Suji Ka Halwa\n" +
                    "\n" +
                    "Servings - 4 – 5\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Ghee - 180 milliliters\n" +
                    "Semolina - 150 grams\n" +
                    "Wheat flour - 40 grams\n" +
                    "Sugar - 200 grams\n" +
                    "Water - 550 milliliters\n" +
                    "Almonds - 2 tablespoons\n" +
                    "Pistachios - 2 tablespoons\n" +
                    "Cashews - 2 tablespoons\n" +
                    "Raisins - 2 tablespoons\n" +
                    "Cardamom powder - 1 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 180 milliliters ghee in a heavy skillet, add 150 grams semolina, 40 grams wheat flour and stir, keep on stirring the semolina for 7 - 8 minutes till the grains change their color.\n" +
                    "2. Add 200 grams sugar, 550 milliliters water and mix well.\n" +
                    "3. Keep on stirring often till the whole mixture starts thickening and starts to leave the edge of the skillet.\n" +
                    "4. Now, add 2 tablespoons almonds, 2 tablespoons pistachios, 2 tablespoons cashews, 2 tablespoons raisins, 1 teaspoon cardamom powder and mix it well.\n" +
                    "5. Cook for 3 - 5 minutes.\n" +
                    "6. Serve hot.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act19".equals(from)) {
            s = "Pineapple Shrikhand\n" +
                    "\n" +
                    "Servings - 2 – 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Pineapple - 410 grams\n" +
                    "Saffron - 1/8 teaspoon\n" +
                    "Water - 1 tablespoon\n" +
                    "Hung yogurt - 400 grams\n" +
                    "Powdered sugar - 175 grams\n" +
                    "Pistachios - 2 tablespoons\n" +
                    "Cherries - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take 410 grams pineapple and cut it into small pieces.\n" +
                    "2. In a bowl, add 1/8 teaspoon saffron, 1 tablespoon water and soak for 30 minutes.\n" +
                    "3. In a mixing bowl, add 400 grams hung yogurt, sliced pineapple, 175 grams powdered sugar, saffron and water mixture, 2 tablespoons pistachios and mix it well.\n" +
                    "4. Transfer into serving bowls, garnish with pistachios and cherry.\n" +
                    "5. Serve chilled.\n" +
                    "\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act20".equals(from)) {
            s = "Chocolate Pumpkin\n" +
                    "\n" +
                    "Servings - 3 – 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Pumpkin slices - 300 grams\n" +
                    "Water - 1 litre\n" +
                    "Sugar - 400 grams\n" +
                    "Cinnamon stick - 2 inch\n" +
                    "Star anise - 2\n" +
                    "Chocolate - 350 grams\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take 300 grams pumpkin slices and prick them toothpick from all the sides.\n" +
                    "2. Heat 1 litre water in a pan, add 400 grams sugar, 2 inch cinnamon stick, 2 star anise and mix well.\n" +
                    "3. Bring it to a boil and allow the sugar to melt.\n" +
                    "4. Add the pumpkin slices in it and mix well.\n" +
                    "5. Cook till it becomes soft.\n" +
                    "6. Add 350 grams chocolate in a bowl and microwave for 2 minutes.\n" +
                    "7. Place the pumpkin slices on a tray.\n" +
                    "8. Pour the melted chocolate over it.\n" +
                    "9. Freeze for 3 - 5 minutes.\n" +
                    "10. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act21".equals(from)) {
            s = "Gur Ki Kheer\n" +
                    "\n" +
                    "Servings - 3 – 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Rice - 100 grams\n" +
                    "Water\n" +
                    "Ghee - 2 tablespoons\n" +
                    "Cashews - 10 - 12\n" +
                    "Raisins - 2 tablespoons\n" +
                    "Milk - 1 litre\n" +
                    "Cardamom powder - 1/2 teaspoon\n" +
                    "Jaggery - 120 grams\n" +
                    "Water - 110 milliliters\n" +
                    "Almonds - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Soak 100 grams rice in water for 30 minutes.\n" +
                    "2. Heat 2 tablespoons ghee in a pan, add 10 - 12 cashews, 2 tablespoons raisins and saute for 2 - 3 minutes or until golden brown.\n" +
                    "3. Take a pot, add 1 litre milk and soaked rice in it.\n" +
                    "4. Mix it well. Bring it to a boil and cook till the rice gets cooked.\n" +
                    "5. Add 1/2 teaspoon cardamom powder and roasted dry fruits in it.\n" +
                    "6. Mix it well.\n" +
                    "7. Take a pan, add 120 grams jaggery, 110 milliliters water and mix well.\n" +
                    "8. Bring it to a boil and allow the jaggery to melt.\n" +
                    "9. Pour the jaggery syrup in the cooked kheer and mix well.\n" +
                    "10. Garnish with almonds.\n" +
                    "11. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act22".equals(from)) {
            s = "Coconut Ladoo\n" +
                    "\n" +
                    "Servings - 5 – 6\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "Desiccated coconut - 110 grams\n" +
                    "Condensed milk - 130 grams\n" +
                    "Organic food color - 1/4 teaspoon\n" +
                    "Cardamom powder - 1/2 teaspoon\n" +
                    "Ghee\n" +
                    "Desiccated coconut\n" +
                    "Rose petals\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 110 grams desiccated coconut, 130 grams condensed milk, 1/4 teaspoon organic food color, 1/2 teaspoon cardamom powder and mix well to combine.\n" +
                    "2. Grease your hands with some ghee, take small portion out of the above mixture and roll it in between your palms to make roundels or balls.\n" +
                    "3. Spread some coconut and rose petals onto a tray. Once all the mix is used up, roll them up in the coconut mix to coat the balls.\n" +
                    "4. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act23".equals(from)) {
            s = "Pineapple Crunch\n" +
                    "\n" +
                    "Servings - 3 – 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Sugar - 230 grams\n" +
                    "Water - 1 tablespoon \n" +
                    "Fresh cream - 225 grams\n" +
                    "Icing sugar - 40 grams\n" +
                    "Vanilla essence - 1/4 teaspoon\n" +
                    "Fruit cake\n" +
                    "Pineapple syrup\n" +
                    "Pineapple\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a pan, add 230 grams sugar, 1 tablespoon water and stir sugar on low heat until it become liquid.\n" +
                    "2. Place a butter paper on a dish and pour the melted sugar on it.\n" +
                    "3. Cool for 5 - 10 minutes.\n" +
                    "4. In a mixing bowl, add 225 grams fresh cream, 40 grams icing sugar, 1/4 teaspoon vanilla essence and beat well.\n" +
                    "5. Take a pyrex dish and make a layer of fruit cake in it.\n" +
                    "6. Drizzle some pineapple syrup on cake slices.\n" +
                    "7. Now place pineapple slices on it.\n" +
                    "8. Pour the cream on top and spread it evenly to make a nice and even layer.\n" +
                    "9. Now crush the crunch and transfer them into a plate.\n" +
                    "10. Garnish with sugar crunch.\n" +
                    "11. Freeze for 30 minutes.\n" +
                    "12. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);
        } else if("Act24".equals(from)) {
            s = "Ghevar\n" +
                    "\n" +
                    "Servings - 2 - 3 \n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Sugar - 470 grams \n" +
                    "Water - 220 milliliters\n" +
                    "Lemon juice - 1 tablespoon\n" +
                    "Rose water - 1 tablespoon\n" +
                    "Ghee - 50 milliliters\n" +
                    "Corn flour - 1 tablespoon\n" +
                    "All purpose flour - 210 grams\n" +
                    "Water - 600 milliliters\n" +
                    "Baking soda - 1/2 teaspoon\n" +
                    "Almonds - for garnishing\n" +
                    "Pistachios - for garnishing\n" +
                    "Rose petals - for garnishing\n" +
                    "Silver leaves - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a pan, add 470 grams sugar, 220 milliliters water and mix well. Bring it to a boil and allow the sugar to melt.\n" +
                    "2. Add 1 tablespoon lemon juice, 1 tablespoon rose water and mix well. \n" +
                    "3. In a mixing bowl, add 50 milliliters ghee and whisk it until it turns creamy.\n" +
                    "4. Add 1 tablespoon corn flour and mix it well.\n" +
                    "5. Now, add 210 grams all purpose flour, 600 milliliters water in two batches and mix well.\n" +
                    "6. Add 1/2 teaspoon baking soda and mix it again.\n" +
                    "7. Heat some ghee in a heavy skillet, place a round shape vessel and pour the ghee into it until it is half submerged.\n" +
                    "8. Once it it gets light brown in color add ghee over it.\n" +
                    "9. Pick the ghevar up and transfer it in sugar syrup and keep it for 30 seconds.\n" +
                    "10. Garnish with almonds, pistachios, silver leaves and rose petals.\n" +
                    "11. Serve\n" +
                    "\n";

            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act25".equals(from)) {
            s = "Aam Panna\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water\n" +
                    "Raw mangoes - 400 grams\n" +
                    "Mango pulp - 190 grams\n" +
                    "Sugar syrup - 70 milliliters\n" +
                    "Cumin powder - 1/2 teaspoon\n" +
                    "Black salt - 1/2 teaspoon\n" +
                    "Black peppercorns - 8\n" +
                    "Mint leaves - 12 - 15\n" +
                    "Water - 600 milliliters\n" +
                    "Mint leaves - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Add water in a pot, add 400 grams raw mangoes and cook on medium heat till the mangoes are soft.\n" +
                    "2. Pell the raw mangoes and transfer them into a bowl. Mash to take out all the pulp.\n" +
                    "3. Add 190 grams mango pulp, 70 milliliters sugar syrup, 1/2 teaspoon cumin powder, 1/2 teaspoon salt, 8 black peppercorns, 12 - 15 mint leaves into a blender and blend it into a smooth paste.\n" +
                    "4. Add 600 milliliters chilled water into a blender and blend again to mix all the ingredients well.\n" +
                    "5. Pour the mixture into the glass.\n" +
                    "6. Garnish with mint leaves.\n" +
                    "7. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act26".equals(from)) {
            s = "Green Tea Detox\n" +
                    "\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 450 milliliters, divided\n" +
                    "Tulsi green tea - 1 tea bag\n" +
                    "Ice\n" +
                    "Lime slices - 4\n" +
                    "Mint leaves - 1 tablespoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Add 250 milliliters water in a pan , add 1 tea bag of tulsi green tea. Bring it to boil.\n" +
                    "2. Strain the mixture into a jug.\n" +
                    "3. Fill the glass with ice , add 4 lime slices , 1 tablespoon mint leaves . Pour the strain mixture in it and add 200 milliliters water.\n" +
                    "4. Stir well.\n" +
                    "5. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act27".equals(from)) {
            s = "Jack Frost\n" +
                    "\n" +
                    "Servings - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Ice - 8 cups\n" +
                    "Pineapple juice - 1 cup\n" +
                    "Curacao blue - 1/2 cup\n" +
                    "Vodka - 1/2 cup\n" +
                    "Coconut cream - 1/2 cup\n" +
                    "Corn syrup - for dab\n" +
                    "Shredded coconut - for dab\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Pour 8 cups ice, 1 cup pineapple juice, 1/2 cup curacao blue, 1/2 cup vodka, 1/2 cup coconut cream in a blender and blend until all ingredients are mixed well.\n" +
                    "2. Pour a thin layer of corn syrup onto a plate and dip the rims of glass into the corn syrup, then dip in coconut flakes.\n" +
                    "3. Serve immediately.\n" +
                    "4. Chill !\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act28".equals(from)) {
            s = " Mango Iced Tea\n" +
                    "\n" +
                    "Servings - 2 \n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 480 mililitters\n" +
                    "Black tea - 1 1/2 teaspoons\n" +
                    "Sugar - 2 tablespoons\n" +
                    "Lemon juice -1 1/2 teaspoons\n" +
                    "Mangoes - 1 1/2 cups\n" +
                    "Ice\n" +
                    "Mint leaves - for garnishing\n" +
                    "Lemon slice - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Add 480 mililitters water in a pan, 1 1/2 teaspoons black tea, 2 tablespoons sugar.Bring it to boil.\n" +
                    "2. Strain the mixture into a jug. Add 1 1/2 teaspoons lemon juice and mix well to combine.\n" +
                    "3. Add 1 1/2 cups mangoes in a blender and blend until smooth.\n" +
                    "4. Pour this into black tea mixture and stir well.\n" +
                    "5. Fill the glass with ice. Pour the mixture into it.\n" +
                    "6. Garnish with mint leaves and lemon slice.\n" +
                    "7. Serve\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act29".equals(from)) {
            s = "Midori Splice\n" +
                    "\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Ice\n" +
                    "Midori - 2 ounces\n" +
                    "Coconut rum - 2 ounces\n" +
                    "Pineapple juice - 6 ounces\n" +
                    "Whipped cream - for garnishing\n" +
                    "Crushed ice\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Fill the shaker with ice, pour 2 ounces midori, 2 ounces coconut rum, 6 ounces pineapple juice and shake well to combine.\n" +
                    "2. Fill the glass with crushed ice, pour the strain mixture into it.\n" +
                    "3. Top with whipped cream.\n" +
                    "4. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act30".equals(from)) {
            s = "Pink Lemonade\n" +
                    "\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "Water - 1/4 cup\n" +
                    "Sugar - 1/4 cup\n" +
                    "Lemon peel - 4 \n" +
                    "Water - 2 cups\n" +
                    "Cranberry juice - 1/4 cup\n" +
                    "Salt - 1/8 teaspoon\n" +
                    "Lemon juice - 3/4 cup\n" +
                    "Ice\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Heat 1/4 cup water in a pan, add 1/4 cup sugar, 4 lemon peels and stir.Bring the mixture to a gentle boil then remove from heat.\n" +
                    "2. Remove lemon peels segments from the simple syrup and transfer to a bowl.\n" +
                    "3. Pour 2 cups water into the jug, pour simple syrup, add 1/4 cup cranberry juice, 1/8 teaspoon salt, 3/4 cup lemon juice and mix well.\n" +
                    "4. Fill the glass with ice, pour the strain mixture into it.\n" +
                    "5. Garnish with lemon slice.\n" +
                    "6. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act31".equals(from)) {
            s = "Black Grape Cocktail\n" +
                    "\n" +
                    "Serving - 1\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Black grapes - 1 cup\n" +
                    "Water - 1/2 cup\n" +
                    "Pineapple juice - 1/2 cup\n" +
                    "Bourbon whiskey - 4 ounces\n" +
                    "Ice\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Add 1 cup black grapes and 1/2 cup water in a blender.Blend until it mixes well.\n" +
                    "2. Pour 1/2 cup pineapple juice and 4 ounces bourbon whiskey and blend until all the ingredients mix well.\n" +
                    "3. Add ice in a glass, pour the cocktail mixture in it.\n" +
                    "4. Garnish with black grapes.\n" +
                    "5. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act32".equals(from)) {
            s = "Indian Lemonade\n" +
                    "\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 500 milliliters\n" +
                    "Lemon - 1\n" +
                    "Black salt - 1 teaspoon\n" +
                    "Sugar - 1 teaspoon\n" +
                    "Cumin powder - 1/2 teaspoon\n" +
                    "Ice\n" +
                    "Lemon slice\n" +
                    "Mint\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Pour 500 milliliters water, 1 lemon juice, 1 teaspoon black salt, 1 teaspoon sugar, 1/2 teaspoon cumin powder in a jug and stir well to combine.\n" +
                    "2. Add ice in a glass. Pour the mixture in it.\n" +
                    "3. Garnish with lemon slice and mint.\n" +
                    "4. Serve and enjoy.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act33".equals(from)) {
            s = "Sunset Cocktail\n" +
                    "\n" +
                    "Serving - 1\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Rum - 1 ounce\n" +
                    "Blue curaçao - 1/2 ounce\n" +
                    "Grenadine - 1/2 ounce\n" +
                    "Ice\n" +
                    "Orange juice - 2 ounces\n" +
                    "Orange slice\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a jug add 1 ounce rum, 1/2 ounce blue curaçao and mix gently.\n" +
                    "2. Pour the 1/2 ounce grenadine, ice, 2 ounces orange juice and cocktail mixture into the glass.\n" +
                    "3. Garnish with orange slice.\n" +
                    "4. Serve and enjoy.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act34".equals(from)) {
            s = "Cucumber Mojito\n" +
                    "\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Water - 3/4 cup\n" +
                    "Sugar - 3/4 cup\n" +
                    "Cucumber - 1\n" +
                    "Mint leaves - 5\n" +
                    "Lemon juice - 1 teaspoon\n" +
                    "Lemon juice - 1/3 cup\n" +
                    "Rum- 1/3 cup\n" +
                    "Green tea - 1/4 cup\n" +
                    "Simple syrup - 1/4 cup\n" +
                    "Lemon wedge\n" +
                    "Ice\n" +
                    "Soda\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a pan add 3/4 cup water, 3/4 cup sugar, 1cucumber and stir.\n" +
                    "3. Bring the mixture to boil and remove the pan from heat.\n" +
                    "4. Add 5 mint leaves, 1 teaspoon lemon juice in a shaker and crush them using a muddler.Pour 1/3 cup lemon juice, 1/3 cup rum, 1/4 cup green tea, 1/4 cup simple syrup and shake well to combine.\n" +
                    "5. Add cucumber, lime wedge, mint leaves, ice, cocktail mixture and top with soda.\n" +
                    "6. Stir to mix well and serve\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act35".equals(from)) {
            s = "Homemade Frooti\n" +
                    "\n" +
                    "Serving - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Mangoes - 650 grams\n" +
                    "Raw mangoes - 300 grams\n" +
                    "Water - 1.5 litre\n" +
                    "Sugar - 1 cup\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a deep pan add 650 grams mangoes, 300 grams raw mangoes, 500 millilitres water and bring it to a boil.\n" +
                    "2. Take a pan and add water, 1 cup sugar and stir until sugar  dissolved.\n" +
                    "3. Add boiled mangoes mixture into a blender and blend it until  smooth.\n" +
                    "4. Transfer to mixing bowl and add disolved sugar into it and mix well.\n" +
                    "5. Pour the strain mixture into the glass.\n" +
                    "6. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act36".equals(from)) {
            s = "Masala Milk\n" +
                    "\n" +
                    "Servings 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Cashews - 20 grams\n" +
                    "Almonds - 20 grams\n" +
                    "Pistachio - 20 grams\n" +
                    "Cardamom powder - 1 teaspoon\n" +
                    "Sugar - 1 tablespoon\n" +
                    "Saffron - 1/8 teaspoon\n" +
                    "Milk - 1 litre\n" +
                    "Sugar - 50 grams\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a blender add 20 grams cashews, 20 grams almonds, 20 grams pistachio, 1 teaspoon cardamom powder, 1 tablespoon sugar, 1/8 teaspoon saffron and blend it until smooth.\n" +
                    "2. Add 1 litre milk in a deep pan and allow it to boil.\n" +
                    "3. Add cashews, almonds paste, 50 grams sugar and mix well to combine.\n" +
                    "4. Allow it to boil on low heat for few minutes.\n" +
                    "5. Pour it into a glass and garnish with sliced almonds.\n" +
                    "6. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act37".equals(from)) {
            s = "";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act38".equals(from)) {
            s = "Nargisi Kofta\n" +
                    "\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Ground lamb meat - 250 grams\n" +
                    "Onions - 50 grams \n" +
                    "Coriander - 2 tablespoons\n" +
                    "Green chili - 10 grams \n" +
                    "Red chili - 1 teaspoon \n" +
                    "Garam masala - 1 teaspoon \n" +
                    "Bread crumbs - 50 grams \n" +
                    "Reﬁned ﬂour - 25 grams \n" +
                    "Eggs - 3, divided\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a bowl, add 250 grams ground lamb meat, 50 grams onions, 2 tablespoons coriander, 10 grams green chili, 1 teaspoon red chili, 1 teaspoon garam masala, 50 grams bread crumbs, 25 grams reﬁned ﬂour and 1 egg. Mix the mixture well.\n" +
                    "2. Boil 2 eggs, let them cool, peel, rinse and dry.\n" +
                    "3. Now take a boiled egg and small amount of meat mixture. Carefully form a layer of meat mixture around the boiled egg and roll it on bread crumbs.\n" +
                    "4. Heat sufficient oil in a heavy skillet. Place the meatball carefully in the oil and deep fry for about 5 minutes, or until the outside is golden brown. Drain on absorbent paper.\n" +
                    "5. Cut it into half and serve hot.\n" +
                    "6. Enjoy.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act39".equals(from)) {
            s = "Naan Burger\n" +
                    "\n" +
                    "Servings - 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Ground chicken - 500 grams\n" +
                    "Green onions - 80 grams\n" +
                    "Ginger - 2 tablespoons\n" +
                    "Lemon juice - 2 tablespoons\n" +
                    "Paprika - 1 tablespoon\n" +
                    "Cumin - 2 teaspoons\n" +
                    "Cardamom - 1/2 teaspoon\n" +
                    "Red chili - 1/4 teaspoon\n" +
                    "Salt - 1 teaspoon\n" +
                    "Turmeric - 1/2 teaspoon\n" +
                    "Dry mango powder - 1/4 teaspoon\n" +
                    "Butter\n" +
                    "\n" +
                    "Yogurt Sauce\n" +
                    "\n" +
                    "Yogurt - 350 milliliters\n" +
                    "Mint - 1 tablespoon\n" +
                    "Cumin - 2 teaspoons\n" +
                    "Lemon juice - 1 tablespoon\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Black pepper - 1/4 teaspoon\n" +
                    "Naan bread\n" +
                    "Onions - to taste\n" +
                    "Cucumber - to taste\n" +
                    "Cilantro - to taste\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 500 grams ground chicken, 80 grams green onions, 2 tablespoons ginger, 2 tablespoons lemon juice, 1 tablespoon paprika, 2 tablespoons cumin, 1/2 teaspoon cardamom, 1/4 teaspoon red chili, 1 teaspoon salt, 1/2 teaspoon turmeric and 1/4 teaspoon dry mango powder. Mix all the ingredients well.\n" +
                    "2. Make equal sized balls from the mixture and flatten slightly.\n" +
                    "3. Preheat grill to medium-high heat and brush with butter. Place patty on the grill. Cook about 2 minutes or until the patty is golden brown. Flip and cook for an additional 3 minutes.\n" +
                    "\n" +
                    "Yogurt Sauce\n" +
                    "1. In a mixing bowl, add 350 milliliters yogurt, 1 tablespoon mint, 2 teaspoons cumin, 1 tablespoon lemon juice, 1/2 teaspoon salt, 1/4 teaspoon black pepper and mix well.\n" +
                    "2. Take a naan bread cut it into half, place the patty on it, top with onions, cucumber and cilantro.\n" +
                    "3. Add the yogurt sauce over it.\n" +
                    "4. Serve and enjoy\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act40".equals(from)) {
            s = "Egg Toast\n" +
                    "Servings - 2\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Bread slices\n" +
                    "Salt - to taste\n" +
                    "Black pepper - to taste\n" +
                    "Egg\n" +
                    "Mozzarella cheese - to taste\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Take a bread slice\n" +
                    "2. Sprinkle some salt and black pepper over it.\n" +
                    "3. Crack an egg into each bread slice.\n" +
                    "4. Add some mozzarella cheese on top of it.\n" +
                    "5. Sprinkle salt, black pepper over bread slice.\n" +
                    "6. Preheat the oven to 350°F/180°C. Bake for 5 - 7 minutes or until the yolks set.\n" +
                    "7. Serve hot.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act41".equals(from)) {
            s = "Baked Chicken Legs\n" +
                    "\n" +
                    "Servings - 6\n" +
                    "\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Chicken legs - 6\n" +
                    "Salt - to taste\n" +
                    "Black pepper - to taste\n" +
                    "Sour cream - 130 milliliters\n" +
                    "Garam masala - 1 1/2 teaspoons\n" +
                    "Cumin - 1/2 tablespoon\n" +
                    "Ground coriander - 1 teaspoon\n" +
                    "Ground ginger - 1/4 teaspoon\n" +
                    "Garlic powder - 2 teaspoons\n" +
                    "Paprika - 1 tablespoon\n" +
                    "Cayenne pepper - 1/4 teaspoon\n" +
                    "Lemon juice - 1 tablespoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Sprinkle salt and pepper on each side of the chicken legs.\n" +
                    "2. In a mixing bowl, add 130 milliliters sour cream, 1 1/2 teaspoons garam masala, 1/2 tablespoon cumin, 1 teaspoon ground coriander, 1/4 teaspoon ground ginger, 2 teaspoons garlic powder, 1 tablespoon paprika, 1/4 teaspoon cayenne pepper, 1 tablespoon lemon juice and mix all the ingredients well.\n" +
                    "3. Add the chicken legs in it and mix it well.\n" +
                    "4. Marinate the chicken for overnight.\n" +
                    "5. Preheat the oven to 400°F/200°C. Bake for 35 - 40 minutes.\n" +
                    "6. Garnish with coriander.\n" +
                    "7. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act42".equals(from)) {
            s = "Chicken Tacos\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Jamaican Jerk Seasoning\n" +
                    "Garlic powder - 1 teaspoon\n" +
                    "Cayenne pepper - 2 teaspoons\n" +
                    "Onion powder - 1 teaspoon\n" +
                    "Sugar - 2 teaspoons\n" +
                    "Salt - 2 teaspoons\n" +
                    "Paprika - 1 teaspoon\n" +
                    "Ground allspice - 1 teaspoon\n" +
                    "Black pepper - 1/2 teaspoon\n" +
                    "Red pepper - 1/2 teaspoon\n" +
                    "Nutmeg - 1/2 teaspoon\n" +
                    "Cinnamon - 1/2 teaspoon\n" +
                    "Parsley powder - 2 tablespoons\n" +
                    "\n" +
                    "Taco\n" +
                    "\n" +
                    "Chicken breasts - 3\n" +
                    "Jamaican Jerk Seasoning - 3 teaspoons\n" +
                    "\n" +
                    "Sauce\n" +
                    "Mayonnaise - 115 grams\n" +
                    "Jamaican Jerk Seasoning - 2 teaspoons\n" +
                    "\n" +
                    "Assembling Taco\n" +
                    "Tortilla\n" +
                    "Lettuce\n" +
                    "Cilantro\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "Jamaican Jerk Seasoning\n" +
                    "1. In a mixing bowl, add 1 teaspoon garlic powder, 2 teaspoons cayenne pepper, 1 teaspoon onion powder, 2 teaspoons sugar, 2 teaspoons salt, 1 teaspoon paprika, 1 teaspoon ground allspice, 1/2 teaspoon black pepper, 1/2 teaspoon red pepper, 1/2 teaspoon nutmeg, 1/2 teaspoon cinnamon and 2 tablespoons parsley powder.\n" +
                    "2. Mix all the ingredients well.\n" +
                    "\n" +
                    "Taco\n" +
                    "1. In a another mixing bowl, add a chicken breast, add 3 tablespoons jamaican jerk seasoning and mix well.\n" +
                    "2. Place the chicken on baking dish.\n" +
                    "3. Preheat oven to 350°F / 180°C and bake for 10 - 15 minutes.\n" +
                    "4. Slice the chicken into strips.\n" +
                    "\n" +
                    "Sauce\n" +
                    "1. In a bowl, add 115 grams mayonnaise, 2 teaspoons jamaican jerk seasoning and mix well.\n" +
                    "\n" +
                    "Assembling Taco\n" +
                    "1. Place lettuce on tortilla. Top with chicken, cilantro and then drizzle with sauce.\n" +
                    "2. Serve with fresh lime wedges for drizzling on tacos\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act43".equals(from)) {
            s = "Chicken Tikka\n" +
                    "\n" +
                    "Servings - 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Cumin - 1 tablespoon\n" +
                    "Coriander powder - 1 tablespoon\n" +
                    "Red chili - 2 teaspoons\n" +
                    "Turmeric - 1 teaspoon\n" +
                    "Dried fenugreek leaves - 1 tablespoon\n" +
                    "Salt - 2 teaspoons\n" +
                    "Mint sauce - 1 teaspoon\n" +
                    "Paprika - 1 tablespoon\n" +
                    "Coriander - 1 tablespoon\n" +
                    "Ginger garlic paste - 1 tablespoon\n" +
                    "Oil - 40 milliliters\n" +
                    "Lemon juice - 1 teaspoon\n" +
                    "Water - 80 milliliters\n" +
                    "Boneless chicken - 500 grams\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, combine all the ingredients except chicken and mix well.\n" +
                    "2. Add this mixture into 500 grams boneless chicken and mix well to combine.\n" +
                    "3. Marinate for 1 hour.\n" +
                    "4. Soak skewers in water for 30 minutes.\n" +
                    "5. Skewer the chicken.\n" +
                    "6. Preheat the oven to 400°F/200°C. Bake for 15 - 20 minutes.\n" +
                    "7. Serve hot.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act44".equals(from)) {
            s = "Spicy Chicken Bites\n" +
                    "\n" +
                    "Serving - 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Almond flour - 170 grams\n" +
                    "Salt - 1/2 teaspoon\n" +
                    "Cracked pepper - 1/4 teaspoon\n" +
                    "Eggs - 3\n" +
                    "Chicken tender - 450 grams\n" +
                    "Honey - 240 milliliters\n" +
                    "Hot Sauce - 50 milliliters\n" +
                    "Garlic Powder - 1/2 teaspoon\n" +
                    "Fresh cream - for garnishing\n" +
                    "Coriander - for garnishing\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 170 grams almond flour, 1/2 teaspoon salt, 1/4 teaspoon cracked pepper and mix well.\n" +
                    "2. Dip 450 grams chicken tenders into eggs and roll them in almond flour mixture.\n" +
                    "3. Rest 30 - 60 minutes.\n" +
                    "4. Add 240 milliliters honey, 50 milliliters hot sauce, 1/2 teaspoon garlic powder in a pan and mix well. Bring this mixture to a boil.\n" +
                    "5. Dip chicken tender in the sauce.\n" +
                    "6. Preheat the oven to 410°F/210°C. Bake for 25 minutes or until the chicken is cooked.\n" +
                    "7. Garnish with fresh cream and coriander.\n" +
                    "8. Serve.\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act45".equals(from)) {
            s = "Black Pepper Chicken\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Black peppercorns - 2 tablespoons\n" +
                    "Fennel seeds - 1 teaspoon\n" +
                    "Cumin - 1 teaspoon\n" +
                    "Oil - 50 milliliters\n" +
                    "Cinnamon stick - 1 inch\n" +
                    "Cloves - 3 pods\n" +
                    "Dry red chili - 3\n" +
                    "Ginger - 1 tablespoon\n" +
                    "Garlic - 1 tablespoon\n" +
                    "Onions - 150 grams\n" +
                    "Turmeric - 1/4 teaspoon\n" +
                    "Salt - 1 teaspoon\n" +
                    "Green chili - 3\n" +
                    "Boneless chicken - 500 grams\n" +
                    "Curry leaves - 10 - 15\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. Crush 2 tablespoons peppercorns, 1 teaspoon fennel seeds, 1 teaspoon cumin in a mortar pestle to make a fine powder.\n" +
                    "2. Transfer them into a bowl and keep aside.\n" +
                    "3. Heat 50 milliliters oil in a pan, add 1 inch cinnamon stick, 3 pods cloves, 3 dry red chili, 1 tablespoon ginger, 1 tablespoon garlic and stir well.\n" +
                    "4. Add 150 grams onions and saute the onions until they are nice and brown.\n" +
                    "5. Now, add 1/4 teaspoon turmeric, 1 teaspoon salt, 3 green chili, freshly ground pepper mixture and mix it well.\n" +
                    "6. Add 500 grams boneless chicken and mix well.\n" +
                    "7. Cook for 10 - 15 minutes.\n" +
                    "8. Add 10 - 15 curry leaves and stir well.\n" +
                    "9. Serve hot\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act46".equals(from)) {
            s = "Chicken Biryani\n" +
                    "\n" +
                    "Servings 3 - 4\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Chicken - 600 grams\n" +
                    "Yogurt -300 grams\n" +
                    "Ginger garlic paste - 2 teaspoons\n" +
                    "Salt -1 teaspoon\n" +
                    "Coriander powder - 1 teaspoon\n" +
                    "Turmeric - 1 teaspoon\n" +
                    "Chicken masala - 1 teaspoon\n" +
                    "Red chili - 1 teaspoon\n" +
                    "Cumin - 1 teaspoon\n" +
                    "Cloves - 3\n" +
                    "Lemon juice - 1 teaspoon\n" +
                    "Oil - 4 tablespoons (divided)\n" +
                    "Cumin - 1 teaspoon\n" +
                    "Bay leaf - 2\n" +
                    "Cloves - 5\n" +
                    "Black peppercorn - 1 teaspoon\n" +
                    "Black cardamom - 2\n" +
                    "Green cardamom - 5-6\n" +
                    "Cinnamon - 1-2 inch\n" +
                    "Soaked rice - 500 grams\n" +
                    "Salt - 1 teaspoon\n" +
                    "Water - 1.5 litre\n" +
                    "Onions - 200 grams\n" +
                    "Ginger garlic paste - 2 teaspoons\n" +
                    "Tomato - 250 grams\n" +
                    "Chicken masala - 1 teaspoon\n" +
                    "Coriander powder - 1 teaspoon\n" +
                    "Red chili - 1 teaspoon\n" +
                    "Turmeric - 1 teaspoon\n" +
                    "Salt - 1 teaspoon\n" +
                    "Water - 50 millilitres\n" +
                    "Black pepper - 1 teaspoon\n" +
                    "Coriander - 2 tablespoon (divided)\n" +
                    "Milk - 2 tablespoons\n" +
                    "Saffron - 1/8 teaspoon\n" +
                    "Fried onions - 50 grams\n" +
                    "Kewra essence - 1 teaspoon\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl add 600 grams chicken, 300 grams yogurt, 2 teaspoons ginger garlic paste, 1 teaspoon salt, 1 teaspoon coriander powder, 1 teaspoon turmeric, 1 teaspoon chicken masala, 1 teaspoon red chili, 1 teaspoon cumin, 3 cloves, 1 teaspoon lemon juice and mix well to combine. Marinate 2 hours.\n" +
                    "2. Heat 1 tablespoon oil in a heavy skillet, add 1 teaspoon cumin, 2 bay leaf, 5 cloves, 1 teaspoon black peppercorn, 2 black cardamom, 5-6 green cardamom, 1-2 inch cinnamon and stir.\n" +
                    "3. Add 500 grams soaked rice, 1 teaspoon salt, 1.5 litre water and stir well. \n" +
                    "4. Cook for 10 - 15 minutes.\n" +
                    "5. Heat 3 tablespoons oil in a heavy skillet, add 200 grams onions and stir until they brown.\n" +
                    "6. Add 2 teaspoons ginger garlic paste, 250 grams tomato and again stir well.\n" +
                    "7. Add 1 teaspoon chicken masala, 1 teaspoon coriander powder, 1 teaspoon red chili, 1 teaspoon turmeric, 1 teaspoon salt and mix well.\n" +
                    "8. Add 50 millilitres water and saute.\n" +
                    "9. Add marinate chicken, 1 teaspoon black pepper and mix well to combine.\n" +
                    "10. Cook for 15 - 20 minutes till the chicken is tender..\n" +
                    "11. Add 1 tablespoon coriander and cooked rice.\n" +
                    "12. Take a bowl, add 2 tablespoons milk, 1/8 teaspoon saffron and mix well.\n" +
                    "13. Pour thé mixture on it.\n" +
                    "14. Again add 1 tablespoon coriander, 50 grams fried onions, 1 teaspoon Keira essence and cook on low flame 10 - 15 minutes.\n" +
                    "15. Serve\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act47".equals(from)) {
            s = "Stuffed Chicken\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "(For Stuffing)\n" +
                    "Oil - 2 1/2 tablespoons\n" +
                    "Garlic - 1 tablespoon\n" +
                    "Ginger - 1 tablespoon\n" +
                    "Onions - 70 grams\n" +
                    "Green chili - 1 tablespoon\n" +
                    "Grated cheese - 100 grams\n" +
                    "Salt - 2 teaspoons\n" +
                    "Garam masala - 2 teaspoons\n" +
                    "Raisins - 2 tablespoons\n" +
                    "Mint leaves - 8\n" +
                    "Boneless chicken breast\n" +
                    "\n" +
                    "(For Gravy)\n" +
                    "Oil - 2 tablespoons\n" +
                    "Green cardamom - 4\n" +
                    "Cloves - 6\n" +
                    "Cinnamon stick - 1 inch\n" +
                    "Onion paste - 100 grams\n" +
                    "Tomato puree - 180 grams\n" +
                    "Turmeric - 1/4 teaspoon\n" +
                    "Red chili - 2 teaspoons\n" +
                    "Coriander powder - 2 teaspoons\n" +
                    "Garam masala - 2 teaspoons\n" +
                    "Salt - 1 teaspoon\n" +
                    "Water - 100 milliliters\n" +
                    "Dried fenugreek - 1 tablespoon\n" +
                    "Butter - 2 tablespoons\n" +
                    "Fresh cream - 50 grams\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "(For Stuffing)\n" +
                    "1. Heat 2 1/2 tablespoons oil in a pan, add 1 tablespoon garlic, 1 tablespoon ginger and stir well.\n" +
                    "2. Add 70 grams onions and fry till they turn translucent.\n" +
                    "3. Now, add 1 tablespoon green chili, 100 grams grated cheese and mix well. Cook for 3 - 5 minutes.\n" +
                    "4. Add 2 teaspoons salt, 2 teaspoons garam masala, 2 tablespoons raisins, 8 mint leaves and mix well. Cook for another 2 minutes.\n" +
                    "\n" +
                    "(For Gravy)\n" +
                    "1. Heat 2 tablespoons oil in a pan, add 4 green cardamom, 6 cloves, 1 inch cinnamon stick, 100 grams onions paste and saute it till the raw flavour of onion is gone.\n" +
                    "2. Now, add 180 grams tomato puree and mix well. Cook for 3 - 5 minutes.\n" +
                    "3. Add 1/4 teaspoon turmeric, 2 teaspoons red chili, 2 teaspoons coriander powder, 2 teaspoons garam masala, 1 teaspoons salt and mix all the ingredients well.\n" +
                    "4. Add 100 milliliters water and mix it again. Cook till the gravy becomes thick and nice.\n" +
                    "5. Now, add 1 tablespoon dried fenugreek, 2 tablespoons butter, 50 grams fresh cream and mix it well. \n" +
                    "\n" +
                    "(Rest of the Preparation)\n" +
                    "1. Slit the chicken breast horizontally breadth wise to get a butterfly cut.\n" +
                    "2. Cover it with a clean wrap and flatten it with a rolling pin.\n" +
                    "3. Place the paneer filling in the chicken and roll it tightly.\n" +
                    "4. Tie the roll stuffed chicken with thread, so the filling will not come out.\n" +
                    "5. Heat some oil in a pan, place the chicken in it and cook it from all the sides or until golden brown.\n" +
                    "6. Place the chicken on a baking tray.\n" +
                    "7. Preheat the oven to 350°F/180°C. Bake for 10 - 20 minutes.\n" +
                    "8. Remove the threads from the chicken and cut it into pieces.\n" +
                    "9. Serve hot with the sauce\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}
        else if("Act48".equals(from)) {
            s = "Lemon Chicken\n" +
                    "\n" +
                    "Servings - 2 - 3\n" +
                    "\n" +
                    "INGREDIENTS\n" +
                    "\n" +
                    "Chicken - 700 grams\n" +
                    "Salt - 1 1/2 teaspoons\n" +
                    "Black pepper - 1 teaspoon\n" +
                    "Corn flour - 25 grams\n" +
                    "Garlic paste - 1 tablespoon\n" +
                    "Oil - 3 tablespoons\n" +
                    "Lemon juice - 3 tablespoons\n" +
                    "Water - 2 tablespoons\n" +
                    "Sugar - 1 teaspoon\n" +
                    "Salt - 1/4 teaspoon\n" +
                    "Black pepper - 1/4 teaspoon\n" +
                    "Lemon zest - 1 teaspoon\n" +
                    "Butter - 1 tablespoon\n" +
                    "Corn flour - 1 tablespoon\n" +
                    "Water - 2 tablespoons\n" +
                    "\n" +
                    "PREPARATION\n" +
                    "\n" +
                    "1. In a mixing bowl, add 700 grams chicken, 1 1/2 teaspoons salt, 1 teaspoon black pepper, 25 grams corn flour, 1 tablespoon garlic paste and mix all the ingredients well.\n" +
                    "2. Marinate for 20 minutes.\n" +
                    "3. Heat 3 tablespoons oil in a heavy skillet and add marinated chicken in it. Stir well.\n" +
                    "4. Cover it with a lid and cook for 10 - 20 minutes or the chicken is cooked.\n" +
                    "5. Transfer it into a bowl and keep aside.\n" +
                    "6. Take a another heavy skillet, add 3 tablespoons lemon juice, 2 tablespoons water, 1 teaspoon sugar, 1/4 teaspoon salt, 1/4 teaspoon black pepper, 1 teaspoon lemon zest, 1 tablespoon butter and stir well.\n" +
                    "7. Now, add the cooked chicken in it and mix it well.\n" +
                    "8. In a bowl, add 1 tablespoon corn flour, 2 tablespoons water and mix well to make paste.\n" +
                    "9. Add the paste in it and mix well.\n" +
                    "10. Serve\n";
            TextView t = (TextView) findViewById(R.id.Act1);
            t.setText(s);}

        else
        {

        }
    }
    public void onBackPressed()
    {
        finish();
    }
    public void home(View view)
    {
        Intent i=new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

}
