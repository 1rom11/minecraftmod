package net.romit.rubymod.datagen;

import net.romit.rubymod.RubyMod;
import net.romit.rubymod.block.ModBlocks;
import net.romit.rubymod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RubyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RAW_RUBY_BLOCK.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_RUBY_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.NETHER_RUBY_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.END_STONE_RUBY_ORE.get());


    }
}
