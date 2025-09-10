package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("bb")
public class class33 extends class603 {

	@ObfuscatedName("bb.af")
	public Image field165;

	@ObfuscatedName("bb.aw")
	public Component field166;

	public class33(int arg0, int arg1, Component arg2, boolean arg3) {
		this.field5998 = arg0;
		this.field5999 = arg1;
		this.field5997 = new int[arg0 * arg1 + 1];
		if (arg3) {
			this.field6000 = new float[arg0 * arg1 + 1];
		}
		DataBufferInt var5 = new DataBufferInt(this.field5997, this.field5997.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5998, this.field5999), var5, null);
		this.field165 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method478(arg2);
		this.method10770();
	}

	@ObfuscatedName("bb.af(Ljava/awt/Component;I)V")
	public final void method478(Component arg0) {
		this.field166 = arg0;
	}

	@ObfuscatedName("bb.aw(III)V")
	public final void method479(int arg0, int arg1) {
		this.method493(this.field166.getGraphics(), arg0, arg1);
	}

	@ObfuscatedName("bb.at(IIIII)V")
	public final void method490(int arg0, int arg1, int arg2, int arg3) {
		this.method482(this.field166.getGraphics(), arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("bb.ac(Ljava/awt/Graphics;III)V")
	public final void method493(Graphics arg0, int arg1, int arg2) {
		try {
			arg0.drawImage(this.field165, arg1, arg2, this.field166);
		} catch (Exception var5) {
			this.field166.repaint();
		}
	}

	@ObfuscatedName("bb.ap(Ljava/awt/Graphics;IIIII)V")
	public final void method482(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Shape var6 = arg0.getClip();
			arg0.clipRect(arg1, arg2, arg3, arg4);
			arg0.drawImage(this.field165, 0, 0, this.field166);
			arg0.setClip(var6);
		} catch (Exception var8) {
			this.field166.repaint();
		}
	}
}
