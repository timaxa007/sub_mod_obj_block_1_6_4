package sub_mod.obj_block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockObj extends Block implements ITileEntityProvider {

	public BlockObj(int id) {
		super(id, Material.circuits);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.25F);
		setStepSound(soundMetalFootstep);
		setTextureName("iron_block");
		setUnlocalizedName(ModBlockObj.MODID + ".block_obj");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityObj();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

}
