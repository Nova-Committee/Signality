package committee.nova.signality.common.itemgroup;

import committee.nova.signality.Signality;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupInit extends ItemGroup {

    public ItemGroupInit() {
        super(Signality.MODID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.DIRT);
    }
}
