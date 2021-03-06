package eu.algent.NewRecipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class Recipes {
    private NewRecipes plugin;

    public Recipes(NewRecipes plugin) {
        this.plugin = plugin;
        initRecipes();
    }

    // Init recipes enabled in conf
    private void initRecipes() {
        if (plugin.getConfig().getBoolean("grass-block", true)) shapelessGrassBlock();
        if (plugin.getConfig().getBoolean("mycelium", true)) shapedMycelium();
        if (plugin.getConfig().getBoolean("moss-stone", true)) shapelessMossStone();
        if (plugin.getConfig().getBoolean("moss-stonebrick", true)) shapelessMossStoneBrick();
        if (plugin.getConfig().getBoolean("cracked-stonebrick", true)) shapelessCrackedStoneBrick();
        if (plugin.getConfig().getBoolean("chiseled-stonebrick", true)) shapedChiseledStoneBrick();
        if (plugin.getConfig().getBoolean("seamless-doubleslab", true)) shapedSeamlessDoubleSlab();
        if (plugin.getConfig().getBoolean("netherbrick", true)) shapedNetherBrick();
        if (plugin.getConfig().getBoolean("soulsand", true)) shapelessSoulSand();    
        if (plugin.getConfig().getBoolean("string", true)) shapelessString();
        if (plugin.getConfig().getBoolean("cobweb", true)) shapedCobweb();
        if (plugin.getConfig().getBoolean("sand", true)) shapelessSand();
        if (plugin.getConfig().getBoolean("clay", true)) shapelessClay();
        if (plugin.getConfig().getBoolean("sponge", true)) shapedSponge();
        if (plugin.getConfig().getBoolean("ice", true)) shapedIce();
        if (plugin.getConfig().getBoolean("flat-snow", true)) shapelessFlatSnow();
        if (plugin.getConfig().getBoolean("slimeball", true)) shapelessSlimeball();
        if (plugin.getConfig().getBoolean("glowstone", true)) shapedGlowstoneBlock();
        if (plugin.getConfig().getBoolean("chain-armor", true)) shapedChainArmor();
    }

    // Grass Block(1): shapeless, 1 Dirt + 1 Seed
    private void shapelessGrassBlock() {
        ShapelessRecipe recipe =  new ShapelessRecipe(new ItemStack(Material.GRASS));
        recipe.addIngredient(Material.DIRT).addIngredient(Material.SEEDS);
        plugin.getServer().addRecipe(recipe);
    }

    // Mycelium(1): shaped, 1 Brown Mushroom + 1 Red Mushroom + 1 Dirt vertically
    private void shapedMycelium() {
        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.MYCEL));
        recipe.shape("b", "r", "d").setIngredient('d', Material.DIRT);
        recipe.setIngredient('r', Material.RED_MUSHROOM).setIngredient('b', Material.BROWN_MUSHROOM);
        plugin.getServer().addRecipe(recipe);
    }

    // Moss Stone(1): shapeless, 1 Cobblestone + 1 Seed
    private void shapelessMossStone() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.MOSSY_COBBLESTONE));
        recipe.addIngredient(Material.COBBLESTONE).addIngredient(Material.SEEDS);
        plugin.getServer().addRecipe(recipe);
    }

    // Mossy Stone Brick(1): shapeless, 1 Stone Brick + 1 Seed
    private void shapelessMossStoneBrick() {
        ShapelessRecipe recipe = new ShapelessRecipe(getItemStackData(Material.SMOOTH_BRICK, 1, 1));
        recipe.addIngredient(Material.SMOOTH_BRICK).addIngredient(Material.SEEDS);
        plugin.getServer().addRecipe(recipe);
    }

    // Cracked Stone Brick(1): shapeless, 1 Stone Brick + 1 Flint
    private void shapelessCrackedStoneBrick() {
        ShapelessRecipe recipe = new ShapelessRecipe(getItemStackData(Material.SMOOTH_BRICK, 1, 2));
        recipe.addIngredient(Material.SMOOTH_BRICK).addIngredient(Material.FLINT);
        plugin.getServer().addRecipe(recipe);
    }

    // Chiseled Stone Brick(1): shaped, 2 Stone Bricks Slab vertically
    private void shapedChiseledStoneBrick() {
        ShapedRecipe recipe = new ShapedRecipe(getItemStackData(Material.SMOOTH_BRICK, 1, 3));
        recipe.shape("o", "o").setIngredient('o', Material.STEP, 5);
        plugin.getServer().addRecipe(recipe);
    }

    // Seamless Double Slab(1): shaped, 2 Stone Slab vertically
    private void shapedSeamlessDoubleSlab() {
        ShapedRecipe recipe = new ShapedRecipe(getItemStackData(Material.DOUBLE_STEP, 1, 8));
        recipe.shape("o", "o").setIngredient('o', Material.STEP);
        plugin.getServer().addRecipe(recipe);
    }

    // Nether Brick(4): shaped, 4 Netherrack in square
    private void shapedNetherBrick() {
        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK, 4));
        recipe.shape("oo", "oo").setIngredient('o', Material.NETHERRACK);
        plugin.getServer().addRecipe(recipe);
    }

    // Soul Sand(1): shapeless, 1 Netherrack + 1 Gravel
    private void shapelessSoulSand() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SOUL_SAND, 1));
        recipe.addIngredient(Material.NETHERRACK).addIngredient(Material.GRAVEL);
        plugin.getServer().addRecipe(recipe);
    }

    // String(4): shapeless, 1 Wool
    private void shapelessString() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
        recipe.addIngredient(Material.WOOL);
        plugin.getServer().addRecipe(recipe);
    }

    // Cobweb(2): shaped, 5 strings in X
    private void shapedCobweb() {
        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.WEB, 2));
        recipe.shape("o o", " o ", "o o").setIngredient('o', Material.STRING);
        plugin.getServer().addRecipe(recipe);
    }

    // Sand(4): shapeless, 1 Sandstone
    private void shapelessSand() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SAND, 4));
        recipe.addIngredient(Material.SANDSTONE);
        plugin.getServer().addRecipe(recipe);
    }

    // Clay(1): shapeless, 1 Dirt + 1 Gravel
    private void shapelessClay() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.CLAY));
        recipe.addIngredient(Material.DIRT).addIngredient(Material.GRAVEL);
        plugin.getServer().addRecipe(recipe);
    }

    // Sponge(1): shaped, 1 Yellow Dye + 8 Leaves with dye in center
    private void shapedSponge() {
        // Oak
        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.SPONGE));
        recipe.shape("lll", "lyl", "lll").setIngredient('y', Material.INK_SACK, 11);
        recipe.setIngredient('l', Material.LEAVES, 0);
        plugin.getServer().addRecipe(recipe);
        // Pine
        ShapedRecipe recipe1 = new ShapedRecipe(new ItemStack(Material.SPONGE));
        recipe1.shape("lll", "lyl", "lll").setIngredient('y', Material.INK_SACK, 11);
        recipe1.setIngredient('l', Material.LEAVES, 1);
        plugin.getServer().addRecipe(recipe1);
        // Birch
        ShapedRecipe recipe2 = new ShapedRecipe(new ItemStack(Material.SPONGE));
        recipe2.shape("lll", "lyl", "lll").setIngredient('y', Material.INK_SACK, 11);
        recipe2.setIngredient('l', Material.LEAVES, 2);
        plugin.getServer().addRecipe(recipe2);
        // Jungle
        ShapedRecipe recipe3 = new ShapedRecipe(new ItemStack(Material.SPONGE));
        recipe3.shape("lll", "lyl", "lll").setIngredient('y', Material.INK_SACK, 11);
        recipe3.setIngredient('l', Material.LEAVES, 3);
        plugin.getServer().addRecipe(recipe3);
    }

    // Ice(1): shaped, 2 Snow Block vertically
    private void shapedIce() {
        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.ICE));
        recipe.shape("o", "o").setIngredient('o', Material.SNOW_BLOCK);
        plugin.getServer().addRecipe(recipe);
    }

    // Flat Snow(1): shapeless, 1 Snow Ball
    private void shapelessFlatSnow() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SNOW));
        recipe.addIngredient(Material.SNOW_BALL);
        plugin.getServer().addRecipe(recipe);
    }

    // Slimeball(1): shapeless, 1 Milk + 1 Lime Dye
    public void shapelessSlimeball() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SLIME_BALL, 1));
        recipe.addIngredient(Material.MILK_BUCKET).addIngredient(Material.INK_SACK, 10);
        plugin.getServer().addRecipe(recipe);
    }

    // Glowstone Block(1): shaped, 1 Yellow Dye + 1 Torch + 1 Soul Sand vertically
    public void shapedGlowstoneBlock() {
        ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.GLOWSTONE));
        recipe.shape("y", "t", "s").setIngredient('y', Material.INK_SACK, 11);
        recipe.setIngredient('t', Material.TORCH).setIngredient('s', Material.SOUL_SAND);
        plugin.getServer().addRecipe(recipe);
    }

    // Full Chain Armor
    public void shapedChainArmor() {
        // Chain Helmet
        ShapedRecipe recipeH = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
        recipeH.shape("ooo", "o o", "   ").setIngredient('o', Material.IRON_FENCE);
        plugin.getServer().addRecipe(recipeH);
        // Chain Chestplate
        ShapedRecipe recipeC = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
        recipeC.shape("o o", "ooo", "ooo").setIngredient('o', Material.IRON_FENCE);
        plugin.getServer().addRecipe(recipeC);
        // Chain Leggings
        ShapedRecipe recipeL = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        recipeL.shape("ooo", "o o", "o o").setIngredient('o', Material.IRON_FENCE);
        plugin.getServer().addRecipe(recipeL);
        // Chain Boots
        ShapedRecipe recipeB = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS));
        recipeB.shape("   ", "o o", "o o").setIngredient('o', Material.IRON_FENCE);
        plugin.getServer().addRecipe(recipeB);
    }
    

    /** 
     * Shortcut to create item stack with data
     * @return {@link ItemStack}
     */
    public ItemStack getItemStackData (Material material, int amount, int data) {
        return new ItemStack(material, amount, (short) 0, (byte) data);
    }
}
