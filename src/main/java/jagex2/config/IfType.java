package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public class IfType {

	@ObfuscatedName("hc.c")
	public static IfType[] list;

	@ObfuscatedName("hc.d")
	public int[] linkObjType;

	@ObfuscatedName("hc.e")
	public int[] linkObjNumber;

	@ObfuscatedName("hc.f")
	public int animFrame;

	@ObfuscatedName("hc.g")
	public int animCycle;

	@ObfuscatedName("hc.h")
	public int id;

	@ObfuscatedName("hc.i")
	public int layerId;

	@ObfuscatedName("hc.j")
	public int type;

	@ObfuscatedName("hc.k")
	public int buttonType;

	@ObfuscatedName("hc.l")
	public int clientCode;

	@ObfuscatedName("hc.m")
	public int width;

	@ObfuscatedName("hc.n")
	public int height;

	@ObfuscatedName("hc.o")
	public int x;

	@ObfuscatedName("hc.p")
	public int y;

	@ObfuscatedName("hc.q")
	public int[][] scripts;

	@ObfuscatedName("hc.r")
	public int[] scriptComparator;

	@ObfuscatedName("hc.s")
	public int[] scriptOperand;

	@ObfuscatedName("hc.t")
	public int overLayerId;

	@ObfuscatedName("hc.u")
	public int scrollHeight;

	@ObfuscatedName("hc.v")
	public int scrollPos;

	@ObfuscatedName("hc.w")
	public boolean hide;

	@ObfuscatedName("hc.x")
	public int[] children;

	@ObfuscatedName("hc.y")
	public int[] childX;

	@ObfuscatedName("hc.z")
	public int[] childY;

	@ObfuscatedName("hc.ab")
	public int modelZoom;

	@ObfuscatedName("hc.bb")
	public int modelXAn;

	@ObfuscatedName("hc.cb")
	public int modelYAn;

	@ObfuscatedName("hc.db")
	public String targetVerb;

	@ObfuscatedName("hc.eb")
	public String targetBase;

	@ObfuscatedName("hc.fb")
	public int targetMask;

	@ObfuscatedName("hc.gb")
	public String buttonText;

	@ObfuscatedName("hc.hb")
	public static LruCache spriteCache;

	@ObfuscatedName("hc.ib")
	public static LruCache modelCache;

	@ObfuscatedName("hc.A")
	public int field859;

	@ObfuscatedName("hc.F")
	public int marginX;

	@ObfuscatedName("hc.G")
	public int marginY;

	@ObfuscatedName("hc.R")
	public int colour;

	@ObfuscatedName("hc.S")
	public int colour2;

	@ObfuscatedName("hc.T")
	public int colourOver;

	@ObfuscatedName("hc.Y")
	public int modelAnim;

	@ObfuscatedName("hc.Z")
	public int modelAnim2;

	@ObfuscatedName("hc.W")
	public Model model1;

	@ObfuscatedName("hc.X")
	public Model model2;

	@ObfuscatedName("hc.U")
	public Pix32 graphic;

	@ObfuscatedName("hc.V")
	public Pix32 graphic2;

	@ObfuscatedName("hc.O")
	public PixFont font;

	@ObfuscatedName("hc.P")
	public String text;

	@ObfuscatedName("hc.Q")
	public String text2;

	@ObfuscatedName("hc.B")
	public boolean field860;

	@ObfuscatedName("hc.C")
	public boolean objSwap;

	@ObfuscatedName("hc.D")
	public boolean objOps;

	@ObfuscatedName("hc.E")
	public boolean objUse;

	@ObfuscatedName("hc.L")
	public boolean fill;

	@ObfuscatedName("hc.M")
	public boolean centre;

	@ObfuscatedName("hc.N")
	public boolean shadow;

	@ObfuscatedName("hc.I")
	public int[] invBackgroundX;

	@ObfuscatedName("hc.J")
	public int[] invBackgroundY;

	@ObfuscatedName("hc.H")
	public Pix32[] invBackground;

	@ObfuscatedName("hc.K")
	public String[] iop;

	@ObfuscatedName("hc.a(Lub;[Ljb;ILub;)V")
	public static void unpack(JagFile arg0, PixFont[] arg1, JagFile arg2) {
		spriteCache = new LruCache(50000);
		modelCache = new LruCache(50000);
		Packet var3 = new Packet(arg2.read("data", null));
		int var4 = -1;
		int var5 = var3.g2();
		list = new IfType[var5];
		while (true) {
			IfType var7;
			do {
				if (var3.pos >= var3.data.length) {
					spriteCache = null;
					modelCache = null;
					return;
				}

				int var6 = var3.g2();
				if (var6 == 0xFFFF) {
					var4 = var3.g2();
					var6 = var3.g2();
				}

				var7 = list[var6] = new IfType();
				var7.id = var6;
				var7.layerId = var4;
				var7.type = var3.g1();
				var7.buttonType = var3.g1();
				var7.clientCode = var3.g2();
				var7.width = var3.g2();
				var7.height = var3.g2();
				var7.overLayerId = var3.g1();
				if (var7.overLayerId == 0) {
					var7.overLayerId = -1;
				} else {
					var7.overLayerId = (var7.overLayerId - 1 << 8) + var3.g1();
				}

				int var8 = var3.g1();
				if (var8 > 0) {
					var7.scriptComparator = new int[var8];
					var7.scriptOperand = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.scriptComparator[var9] = var3.g1();
						var7.scriptOperand[var9] = var3.g2();
					}
				}

				int var10 = var3.g1();
				if (var10 > 0) {
					var7.scripts = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.g2();
						var7.scripts[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.scripts[var11][var13] = var3.g2();
						}
					}
				}

				if (var7.type == 0) {
					var7.scrollHeight = var3.g2();
					var7.hide = var3.g1() == 1;
					int var14 = var3.g1();
					var7.children = new int[var14];
					var7.childX = new int[var14];
					var7.childY = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.children[var15] = var3.g2();
						var7.childX[var15] = var3.g2b();
						var7.childY[var15] = var3.g2b();
					}
				}

				if (var7.type == 1) {
					var7.field859 = var3.g2();
					var7.field860 = var3.g1() == 1;
				}

				if (var7.type == 2) {
					var7.linkObjType = new int[var7.height * var7.width];
					var7.linkObjNumber = new int[var7.height * var7.width];
					var7.objSwap = var3.g1() == 1;
					var7.objOps = var3.g1() == 1;
					var7.objUse = var3.g1() == 1;
					var7.marginX = var3.g1();
					var7.marginY = var3.g1();
					var7.invBackgroundX = new int[20];
					var7.invBackgroundY = new int[20];
					var7.invBackground = new Pix32[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.g1();
						if (var17 == 1) {
							var7.invBackgroundX[var16] = var3.g2b();
							var7.invBackgroundY[var16] = var3.g2b();
							String var18 = var3.gstr();
							if (arg0 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.invBackground[var16] = getSprite(arg0, Integer.parseInt(var18.substring(var19 + 1)), var18.substring(0, var19));
							}
						}
					}

					var7.iop = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.iop[var20] = var3.gstr();
						if (var7.iop[var20].length() == 0) {
							var7.iop[var20] = null;
						}
					}
				}

				if (var7.type == 3) {
					var7.fill = var3.g1() == 1;
				}

				if (var7.type == 4 || var7.type == 1) {
					var7.centre = var3.g1() == 1;
					int var21 = var3.g1();
					if (arg1 != null) {
						var7.font = arg1[var21];
					}

					var7.shadow = var3.g1() == 1;
				}

				if (var7.type == 4) {
					var7.text = var3.gstr();
					var7.text2 = var3.gstr();
				}

				if (var7.type == 1 || var7.type == 3 || var7.type == 4) {
					var7.colour = var3.g4();
				}

				if (var7.type == 3 || var7.type == 4) {
					var7.colour2 = var3.g4();
					var7.colourOver = var3.g4();
				}

				if (var7.type == 5) {
					String var22 = var3.gstr();
					if (arg0 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.graphic = getSprite(arg0, Integer.parseInt(var22.substring(var23 + 1)), var22.substring(0, var23));
					}

					String var24 = var3.gstr();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.graphic2 = getSprite(arg0, Integer.parseInt(var24.substring(var25 + 1)), var24.substring(0, var25));
					}
				}

				if (var7.type == 6) {
					int var26 = var3.g1();
					if (var26 != 0) {
						var7.model1 = getModel((var26 - 1 << 8) + var3.g1());
					}

					int var27 = var3.g1();
					if (var27 != 0) {
						var7.model2 = getModel((var27 - 1 << 8) + var3.g1());
					}

					int var28 = var3.g1();
					if (var28 == 0) {
						var7.modelAnim = -1;
					} else {
						var7.modelAnim = (var28 - 1 << 8) + var3.g1();
					}

					int var29 = var3.g1();
					if (var29 == 0) {
						var7.modelAnim2 = -1;
					} else {
						var7.modelAnim2 = (var29 - 1 << 8) + var3.g1();
					}

					var7.modelZoom = var3.g2();
					var7.modelXAn = var3.g2();
					var7.modelYAn = var3.g2();
				}

				if (var7.type == 7) {
					var7.linkObjType = new int[var7.height * var7.width];
					var7.linkObjNumber = new int[var7.height * var7.width];
					var7.centre = var3.g1() == 1;
					int var30 = var3.g1();
					if (arg1 != null) {
						var7.font = arg1[var30];
					}

					var7.shadow = var3.g1() == 1;
					var7.colour = var3.g4();
					var7.marginX = var3.g2b();
					var7.marginY = var3.g2b();
					var7.objOps = var3.g1() == 1;
					var7.iop = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.iop[var31] = var3.gstr();
						if (var7.iop[var31].length() == 0) {
							var7.iop[var31] = null;
						}
					}
				}

				if (var7.buttonType == 2 || var7.type == 2) {
					var7.targetVerb = var3.gstr();
					var7.targetBase = var3.gstr();
					var7.targetMask = var3.g2();
				}
			} while (var7.buttonType != 1 && var7.buttonType != 4 && var7.buttonType != 5 && var7.buttonType != 6);

			var7.buttonText = var3.gstr();
			if (var7.buttonText.length() == 0) {
				if (var7.buttonType == 1) {
					var7.buttonText = "Ok";
				}

				if (var7.buttonType == 4) {
					var7.buttonText = "Select";
				}

				if (var7.buttonType == 5) {
					var7.buttonText = "Select";
				}

				if (var7.buttonType == 6) {
					var7.buttonText = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("hc.a(IIZ)Leb;")
	public Model getTempModel(int arg0, int arg1, boolean arg2) {
		Model var4 = model1;
		if (arg2) {
			var4 = model2;
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.faceColour == null) {
			return var4;
		} else {
			Model var5 = new Model(var4, true, true, false);
			if (arg0 != -1 || arg1 != -1) {
				var5.prepareAnim();
			}

			if (arg0 != -1) {
				var5.animate(arg0);
			}

			if (arg1 != -1) {
				var5.animate(arg1);
			}

			var5.calculateNormals(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("hc.a(Lub;ILjava/lang/String;I)Lhb;")
	public static Pix32 getSprite(JagFile arg0, int arg1, String arg2) {
		long var3 = (JString.hashCode(arg2) << 8) + arg1;
		Pix32 var5 = (Pix32) spriteCache.find(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			Pix32 var6 = new Pix32(arg0, arg2, arg1);
			spriteCache.put(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("hc.a(II)Leb;")
	public static Model getModel(int arg0) {
		Model var1 = (Model) modelCache.find(arg0);
		if (var1 == null) {
			Model var2 = new Model(arg0);
			modelCache.put(arg0, var2);
			return var2;
		}

		return var1;
	}
}
