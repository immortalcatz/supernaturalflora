package gq.cestaberous.supernaturalflora;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDeadSoilSkeleton extends Block {

	protected BlockDeadSoilSkeleton(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		//this.setBlockUnbreakable(); //unbreakable, still explodes
		//this.setResistance(2000.0F); //TNT resistant 15.0F-mild
		this.setHardness(0.5F); //How long to break 1.0F - Log //Based on material properties, check Material class
		//this.setHarvestLevel("pickaxe", 3); //require tool to harvest, what kind, what level //Requires toolRequired material
		this.setLightLevel(0.0F); //between 1.0F and 0.0F how much illumination
		//this.setLightOpacity(5); //between 1 and 16, allow light through it, 15 levels, no levels, resp.
		this.setStepSound(this.soundTypeGrass); //step sound type
	}

}
