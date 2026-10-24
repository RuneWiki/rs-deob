package jagex2.config;

import deob.ObfuscatedName;
import deob.client;
import jagex2.datastruct.LruCache;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import jagex2.jstring.JString;

@ObfuscatedName("DUCMKFAY")
public class Component {

	@ObfuscatedName("DUCMKFAY.fb")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("DUCMKFAY.V")
	public byte alpha;

	@ObfuscatedName("DUCMKFAY.b")
	public int animCycle;

	@ObfuscatedName("DUCMKFAY.e")
	public int field629;

	@ObfuscatedName("DUCMKFAY.h")
	public int clientCode;

	@ObfuscatedName("DUCMKFAY.j")
	public int overColour;

	@ObfuscatedName("DUCMKFAY.k")
	public int buttonType;

	@ObfuscatedName("DUCMKFAY.m")
	public int activeColour;

	@ObfuscatedName("DUCMKFAY.n")
	public int width;

	@ObfuscatedName("DUCMKFAY.r")
	public int scrollPosition;

	@ObfuscatedName("DUCMKFAY.x")
	public int overlayer;

	@ObfuscatedName("DUCMKFAY.y")
	public int marginX;

	@ObfuscatedName("DUCMKFAY.z")
	public int colour;

	@ObfuscatedName("DUCMKFAY.A")
	public int modelType;

	@ObfuscatedName("DUCMKFAY.B")
	public int model;

	@ObfuscatedName("DUCMKFAY.D")
	public int layer;

	@ObfuscatedName("DUCMKFAY.E")
	public int targetMask;

	@ObfuscatedName("DUCMKFAY.G")
	public int activeOverColour;

	@ObfuscatedName("DUCMKFAY.L")
	public int marginY;

	@ObfuscatedName("DUCMKFAY.N")
	public int animFrame;

	@ObfuscatedName("DUCMKFAY.R")
	public int id;

	@ObfuscatedName("DUCMKFAY.W")
	public int activeModelType;

	@ObfuscatedName("DUCMKFAY.X")
	public int activeModel;

	@ObfuscatedName("DUCMKFAY.Y")
	public int anim;

	@ObfuscatedName("DUCMKFAY.Z")
	public int activeAnim;

	@ObfuscatedName("DUCMKFAY.cb")
	public int scroll;

	@ObfuscatedName("DUCMKFAY.db")
	public int type;

	@ObfuscatedName("DUCMKFAY.eb")
	public int x;

	@ObfuscatedName("DUCMKFAY.gb")
	public int y;

	@ObfuscatedName("DUCMKFAY.ib")
	public int height;

	@ObfuscatedName("DUCMKFAY.kb")
	public int zoom;

	@ObfuscatedName("DUCMKFAY.lb")
	public int xan;

	@ObfuscatedName("DUCMKFAY.mb")
	public int yan;

	@ObfuscatedName("DUCMKFAY.a")
	public Pix32 graphic;

	@ObfuscatedName("DUCMKFAY.bb")
	public Pix32 activeGraphic;

	@ObfuscatedName("DUCMKFAY.F")
	public static LruCache imageCache;

	@ObfuscatedName("DUCMKFAY.K")
	public PixFont font;

	@ObfuscatedName("DUCMKFAY.l")
	public String targetText;

	@ObfuscatedName("DUCMKFAY.o")
	public String option;

	@ObfuscatedName("DUCMKFAY.p")
	public String targetVerb;

	@ObfuscatedName("DUCMKFAY.v")
	public String activeText;

	@ObfuscatedName("DUCMKFAY.P")
	public String text;

	@ObfuscatedName("DUCMKFAY.q")
	public boolean center;

	@ObfuscatedName("DUCMKFAY.u")
	public boolean fill;

	@ObfuscatedName("DUCMKFAY.C")
	public boolean swappable;

	@ObfuscatedName("DUCMKFAY.J")
	public boolean usable;

	@ObfuscatedName("DUCMKFAY.Q")
	public boolean interactable;

	@ObfuscatedName("DUCMKFAY.S")
	public boolean field667;

	@ObfuscatedName("DUCMKFAY.ab")
	public boolean draggable;

	@ObfuscatedName("DUCMKFAY.hb")
	public boolean hide;

	@ObfuscatedName("DUCMKFAY.jb")
	public boolean shadowed;

	@ObfuscatedName("DUCMKFAY.f")
	public int[] scriptOperand;

	@ObfuscatedName("DUCMKFAY.i")
	public int[] invSlotOffsetX;

	@ObfuscatedName("DUCMKFAY.H")
	public int[] children;

	@ObfuscatedName("DUCMKFAY.I")
	public int[] childX;

	@ObfuscatedName("DUCMKFAY.M")
	public int[] scriptComparator;

	@ObfuscatedName("DUCMKFAY.O")
	public int[] invSlotOffsetY;

	@ObfuscatedName("DUCMKFAY.T")
	public int[] invSlotObjCount;

	@ObfuscatedName("DUCMKFAY.U")
	public int[] invSlotObjId;

	@ObfuscatedName("DUCMKFAY.nb")
	public int[] childY;

	@ObfuscatedName("DUCMKFAY.c")
	public Pix32[] invSlotGraphic;

	@ObfuscatedName("DUCMKFAY.d")
	public static Component[] instances;

	@ObfuscatedName("DUCMKFAY.s")
	public String[] iop;

	@ObfuscatedName("DUCMKFAY.t")
	public int[][] scripts;

	@ObfuscatedName("DUCMKFAY.a(IBI)V")
	public void swapObj(int arg0, int arg1) {
		int var3 = invSlotObjId[arg0];
		invSlotObjId[arg0] = invSlotObjId[arg1];
		invSlotObjId[arg1] = var3;
		int var4 = invSlotObjCount[arg0];
		invSlotObjCount[arg0] = invSlotObjCount[arg1];
		invSlotObjCount[arg1] = var4;
	}

	@ObfuscatedName("DUCMKFAY.a(LXTGLDHGX;[LYXVQXWYR;BLXTGLDHGX;)V")
	public static void unpack(Jagfile arg0, PixFont[] arg1, Jagfile arg2) {
		imageCache = new LruCache(50000);
		Packet var3 = new Packet(arg0.read("data", null));
		int var4 = -1;
		int var5 = var3.g2();
		instances = new Component[var5];
		while (true) {
			Component var7;
			do {
				if (var3.pos >= var3.data.length) {
					imageCache = null;
					return;
				}

				int var6 = var3.g2();
				if (var6 == 0xFFFF) {
					var4 = var3.g2();
					var6 = var3.g2();
				}

				var7 = instances[var6] = new Component();
				var7.id = var6;
				var7.layer = var4;
				var7.type = var3.g1();
				var7.buttonType = var3.g1();
				var7.clientCode = var3.g2();
				var7.width = var3.g2();
				var7.height = var3.g2();
				var7.alpha = (byte) var3.g1();
				var7.overlayer = var3.g1();
				if (var7.overlayer == 0) {
					var7.overlayer = -1;
				} else {
					var7.overlayer = (var7.overlayer - 1 << 8) + var3.g1();
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
					var7.scroll = var3.g2();
					var7.hide = var3.g1() == 1;
					int var14 = var3.g2();
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
					var7.field629 = var3.g2();
					var7.field667 = var3.g1() == 1;
				}

				if (var7.type == 2) {
					var7.invSlotObjId = new int[var7.height * var7.width];
					var7.invSlotObjCount = new int[var7.height * var7.width];
					var7.draggable = var3.g1() == 1;
					var7.interactable = var3.g1() == 1;
					var7.usable = var3.g1() == 1;
					var7.swappable = var3.g1() == 1;
					var7.marginX = var3.g1();
					var7.marginY = var3.g1();
					var7.invSlotOffsetX = new int[20];
					var7.invSlotOffsetY = new int[20];
					var7.invSlotGraphic = new Pix32[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.g1();
						if (var17 == 1) {
							var7.invSlotOffsetX[var16] = var3.g2b();
							var7.invSlotOffsetY[var16] = var3.g2b();
							String var18 = var3.gjstr();
							if (arg2 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.invSlotGraphic[var16] = getImage(Integer.parseInt(var18.substring(var19 + 1)), arg2, var18.substring(0, var19));
							}
						}
					}

					var7.iop = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.iop[var20] = var3.gjstr();
						if (var7.iop[var20].length() == 0) {
							var7.iop[var20] = null;
						}
					}
				}

				if (var7.type == 3) {
					var7.fill = var3.g1() == 1;
				}

				if (var7.type == 4 || var7.type == 1) {
					var7.center = var3.g1() == 1;
					int var21 = var3.g1();
					if (arg1 != null) {
						var7.font = arg1[var21];
					}

					var7.shadowed = var3.g1() == 1;
				}

				if (var7.type == 4) {
					var7.text = var3.gjstr();
					var7.activeText = var3.gjstr();
				}

				if (var7.type == 1 || var7.type == 3 || var7.type == 4) {
					var7.colour = var3.g4();
				}

				if (var7.type == 3 || var7.type == 4) {
					var7.activeColour = var3.g4();
					var7.overColour = var3.g4();
					var7.activeOverColour = var3.g4();
				}

				if (var7.type == 5) {
					String var22 = var3.gjstr();
					if (arg2 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.graphic = getImage(Integer.parseInt(var22.substring(var23 + 1)), arg2, var22.substring(0, var23));
					}

					String var24 = var3.gjstr();
					if (arg2 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.activeGraphic = getImage(Integer.parseInt(var24.substring(var25 + 1)), arg2, var24.substring(0, var25));
					}
				}

				if (var7.type == 6) {
					int var26 = var3.g1();
					if (var26 != 0) {
						var7.modelType = 1;
						var7.model = (var26 - 1 << 8) + var3.g1();
					}

					int var27 = var3.g1();
					if (var27 != 0) {
						var7.activeModelType = 1;
						var7.activeModel = (var27 - 1 << 8) + var3.g1();
					}

					int var28 = var3.g1();
					if (var28 == 0) {
						var7.anim = -1;
					} else {
						var7.anim = (var28 - 1 << 8) + var3.g1();
					}

					int var29 = var3.g1();
					if (var29 == 0) {
						var7.activeAnim = -1;
					} else {
						var7.activeAnim = (var29 - 1 << 8) + var3.g1();
					}

					var7.zoom = var3.g2();
					var7.xan = var3.g2();
					var7.yan = var3.g2();
				}

				if (var7.type == 7) {
					var7.invSlotObjId = new int[var7.height * var7.width];
					var7.invSlotObjCount = new int[var7.height * var7.width];
					var7.center = var3.g1() == 1;
					int var30 = var3.g1();
					if (arg1 != null) {
						var7.font = arg1[var30];
					}

					var7.shadowed = var3.g1() == 1;
					var7.colour = var3.g4();
					var7.marginX = var3.g2b();
					var7.marginY = var3.g2b();
					var7.interactable = var3.g1() == 1;
					var7.iop = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.iop[var31] = var3.gjstr();
						if (var7.iop[var31].length() == 0) {
							var7.iop[var31] = null;
						}
					}
				}

				if (var7.buttonType == 2 || var7.type == 2) {
					var7.targetVerb = var3.gjstr();
					var7.targetText = var3.gjstr();
					var7.targetMask = var3.g2();
				}
			} while (var7.buttonType != 1 && var7.buttonType != 4 && var7.buttonType != 5 && var7.buttonType != 6);

			var7.option = var3.gjstr();
			if (var7.option.length() == 0) {
				if (var7.buttonType == 1) {
					var7.option = "Ok";
				}

				if (var7.buttonType == 4) {
					var7.option = "Select";
				}

				if (var7.buttonType == 5) {
					var7.option = "Select";
				}

				if (var7.buttonType == 6) {
					var7.option = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("DUCMKFAY.a(II)LZKARKDQW;")
	public Model getModel(int arg0, int arg1) {
		Model var3 = (Model) modelCache.get((arg0 << 16) + arg1);
		if (var3 != null) {
			return var3;
		}

		if (arg0 == 1) {
			var3 = Model.tryGet(arg1);
		}

		if (arg0 == 2) {
			var3 = NpcType.get(arg1).getHeadModel();
		}

		if (arg0 == 3) {
			var3 = client.localPlayer.getHeadModel();
		}

		if (arg0 == 4) {
			var3 = ObjType.get(arg1).getInvModel(50);
		}

		if (arg0 == 5) {
			var3 = null;
		}

		if (var3 != null) {
			modelCache.put(var3, (arg0 << 16) + arg1);
		}

		return var3;
	}

	@ObfuscatedName("DUCMKFAY.a(IZLXTGLDHGX;Ljava/lang/String;)LCXGZMTJK;")
	public static Pix32 getImage(int arg0, Jagfile arg1, String arg2) {
		long var3 = (JString.hashCode(arg2) << 8) + arg0;
		Pix32 var5 = (Pix32) imageCache.get(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			Pix32 var6 = new Pix32(arg1, arg2, arg0);
			imageCache.put(var6, var3);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("DUCMKFAY.a(IZILZKARKDQW;)V")
	public static void cacheModel(int arg0, int arg1, Model arg2) {
		modelCache.clear();

		if (arg2 != null && arg1 != 4) {
			modelCache.put(arg2, (arg1 << 16) + arg0);
		}
	}

	@ObfuscatedName("DUCMKFAY.a(IIIZ)LZKARKDQW;")
	public Model getModel(int arg0, int arg1, boolean arg2) {
		Model var4;
		if (arg2) {
			var4 = getModel(activeModelType, activeModel);
		} else {
			var4 = getModel(modelType, model);
		}

		if (var4 == null) {
			return null;
		} else if (arg1 == -1 && arg0 == -1 && var4.faceColour == null) {
			return var4;
		} else {
			Model var5 = new Model(true, AnimFrame.isNull(arg1) & AnimFrame.isNull(arg0), false, var4);
			if (arg1 != -1 || arg0 != -1) {
				var5.createLabelReferences();
			}

			if (arg1 != -1) {
				var5.applyTransform(arg1);
			}

			if (arg0 != -1) {
				var5.applyTransform(arg0);
			}

			var5.calculateNormals(64, 768, -50, -10, -50, true);
			return var5;
		}
	}
}
