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

public class Component {

	@ObfuscatedName("DUCMKFAY.g")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("DUCMKFAY.w")
	public int _flowObfuscator2 = 891;

	@ObfuscatedName("DUCMKFAY.fb")
	public static LruCache modelCache = new LruCache(false, 30);

	@ObfuscatedName("DUCMKFAY.V")
	public byte alpha;

	@ObfuscatedName("DUCMKFAY.b")
	public int animCycle;

	@ObfuscatedName("DUCMKFAY.e")
	public int field720;

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
	public boolean field760;

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
	public void swapObj(int arg0, byte arg1, int arg2) {
		int var4 = this.invSlotObjId[arg0];
		this.invSlotObjId[arg0] = this.invSlotObjId[arg2];
		if (arg1 == 9) {
			boolean var5 = false;
		} else {
			this._flowObfuscator2 = -76;
		}
		this.invSlotObjId[arg2] = var4;
		int var6 = this.invSlotObjCount[arg0];
		this.invSlotObjCount[arg0] = this.invSlotObjCount[arg2];
		this.invSlotObjCount[arg2] = var6;
	}

	@ObfuscatedName("DUCMKFAY.a(LXTGLDHGX;[LYXVQXWYR;BLXTGLDHGX;)V")
	public static void unpack(Jagfile arg0, PixFont[] arg1, byte arg2, Jagfile arg3) {
		imageCache = new LruCache(false, 50000);
		Packet var4 = new Packet(arg0.read("data", null), 891);
		int var5 = -1;
		int var6 = var4.g2();
		instances = new Component[var6];
		while (true) {
			Component var8;
			do {
				if (var4.pos >= var4.data.length) {
					imageCache = null;
					if (arg2 != -84) {
						return;
					}
					return;
				}
				int var7 = var4.g2();
				if (var7 == 65535) {
					var5 = var4.g2();
					var7 = var4.g2();
				}
				var8 = instances[var7] = new Component();
				var8.id = var7;
				var8.layer = var5;
				var8.type = var4.g1();
				var8.buttonType = var4.g1();
				var8.clientCode = var4.g2();
				var8.width = var4.g2();
				var8.height = var4.g2();
				var8.alpha = (byte) var4.g1();
				var8.overlayer = var4.g1();
				if (var8.overlayer == 0) {
					var8.overlayer = -1;
				} else {
					var8.overlayer = (var8.overlayer - 1 << 8) + var4.g1();
				}
				int var9 = var4.g1();
				if (var9 > 0) {
					var8.scriptComparator = new int[var9];
					var8.scriptOperand = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						var8.scriptComparator[var10] = var4.g1();
						var8.scriptOperand[var10] = var4.g2();
					}
				}
				int var11 = var4.g1();
				if (var11 > 0) {
					var8.scripts = new int[var11][];
					for (int var12 = 0; var12 < var11; var12++) {
						int var13 = var4.g2();
						var8.scripts[var12] = new int[var13];
						for (int var14 = 0; var14 < var13; var14++) {
							var8.scripts[var12][var14] = var4.g2();
						}
					}
				}
				if (var8.type == 0) {
					var8.scroll = var4.g2();
					var8.hide = var4.g1() == 1;
					int var15 = var4.g2();
					var8.children = new int[var15];
					var8.childX = new int[var15];
					var8.childY = new int[var15];
					for (int var16 = 0; var16 < var15; var16++) {
						var8.children[var16] = var4.g2();
						var8.childX[var16] = var4.g2b();
						var8.childY[var16] = var4.g2b();
					}
				}
				if (var8.type == 1) {
					var8.field720 = var4.g2();
					var8.field760 = var4.g1() == 1;
				}
				if (var8.type == 2) {
					var8.invSlotObjId = new int[var8.height * var8.width];
					var8.invSlotObjCount = new int[var8.height * var8.width];
					var8.draggable = var4.g1() == 1;
					var8.interactable = var4.g1() == 1;
					var8.usable = var4.g1() == 1;
					var8.swappable = var4.g1() == 1;
					var8.marginX = var4.g1();
					var8.marginY = var4.g1();
					var8.invSlotOffsetX = new int[20];
					var8.invSlotOffsetY = new int[20];
					var8.invSlotGraphic = new Pix32[20];
					for (int var17 = 0; var17 < 20; var17++) {
						int var19 = var4.g1();
						if (var19 == 1) {
							var8.invSlotOffsetX[var17] = var4.g2b();
							var8.invSlotOffsetY[var17] = var4.g2b();
							String var20 = var4.gjstr();
							if (arg3 != null && var20.length() > 0) {
								int var21 = var20.lastIndexOf(",");
								var8.invSlotGraphic[var17] = getImage(Integer.parseInt(var20.substring(var21 + 1)), false, arg3, var20.substring(0, var21));
							}
						}
					}
					var8.iop = new String[5];
					for (int var18 = 0; var18 < 5; var18++) {
						var8.iop[var18] = var4.gjstr();
						if (var8.iop[var18].length() == 0) {
							var8.iop[var18] = null;
						}
					}
				}
				if (var8.type == 3) {
					var8.fill = var4.g1() == 1;
				}
				if (var8.type == 4 || var8.type == 1) {
					var8.center = var4.g1() == 1;
					int var22 = var4.g1();
					if (arg1 != null) {
						var8.font = arg1[var22];
					}
					var8.shadowed = var4.g1() == 1;
				}
				if (var8.type == 4) {
					var8.text = var4.gjstr();
					var8.activeText = var4.gjstr();
				}
				if (var8.type == 1 || var8.type == 3 || var8.type == 4) {
					var8.colour = var4.g4();
				}
				if (var8.type == 3 || var8.type == 4) {
					var8.activeColour = var4.g4();
					var8.overColour = var4.g4();
					var8.activeOverColour = var4.g4();
				}
				if (var8.type == 5) {
					String var23 = var4.gjstr();
					if (arg3 != null && var23.length() > 0) {
						int var24 = var23.lastIndexOf(",");
						var8.graphic = getImage(Integer.parseInt(var23.substring(var24 + 1)), false, arg3, var23.substring(0, var24));
					}
					String var25 = var4.gjstr();
					if (arg3 != null && var25.length() > 0) {
						int var26 = var25.lastIndexOf(",");
						var8.activeGraphic = getImage(Integer.parseInt(var25.substring(var26 + 1)), false, arg3, var25.substring(0, var26));
					}
				}
				if (var8.type == 6) {
					int var27 = var4.g1();
					if (var27 != 0) {
						var8.modelType = 1;
						var8.model = (var27 - 1 << 8) + var4.g1();
					}
					int var28 = var4.g1();
					if (var28 != 0) {
						var8.activeModelType = 1;
						var8.activeModel = (var28 - 1 << 8) + var4.g1();
					}
					int var29 = var4.g1();
					if (var29 == 0) {
						var8.anim = -1;
					} else {
						var8.anim = (var29 - 1 << 8) + var4.g1();
					}
					int var30 = var4.g1();
					if (var30 == 0) {
						var8.activeAnim = -1;
					} else {
						var8.activeAnim = (var30 - 1 << 8) + var4.g1();
					}
					var8.zoom = var4.g2();
					var8.xan = var4.g2();
					var8.yan = var4.g2();
				}
				if (var8.type == 7) {
					var8.invSlotObjId = new int[var8.height * var8.width];
					var8.invSlotObjCount = new int[var8.height * var8.width];
					var8.center = var4.g1() == 1;
					int var31 = var4.g1();
					if (arg1 != null) {
						var8.font = arg1[var31];
					}
					var8.shadowed = var4.g1() == 1;
					var8.colour = var4.g4();
					var8.marginX = var4.g2b();
					var8.marginY = var4.g2b();
					var8.interactable = var4.g1() == 1;
					var8.iop = new String[5];
					for (int var32 = 0; var32 < 5; var32++) {
						var8.iop[var32] = var4.gjstr();
						if (var8.iop[var32].length() == 0) {
							var8.iop[var32] = null;
						}
					}
				}
				if (var8.buttonType == 2 || var8.type == 2) {
					var8.targetVerb = var4.gjstr();
					var8.targetText = var4.gjstr();
					var8.targetMask = var4.g2();
				}
			} while (var8.buttonType != 1 && var8.buttonType != 4 && var8.buttonType != 5 && var8.buttonType != 6);
			var8.option = var4.gjstr();
			if (var8.option.length() == 0) {
				if (var8.buttonType == 1) {
					var8.option = "Ok";
				}
				if (var8.buttonType == 4) {
					var8.option = "Select";
				}
				if (var8.buttonType == 5) {
					var8.option = "Select";
				}
				if (var8.buttonType == 6) {
					var8.option = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("DUCMKFAY.a(II)LZKARKDQW;")
	public Model getModel(int arg0, int arg1) {
		Model var3 = (Model) modelCache.get((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.tryGet(this._flowObfuscator1, arg1);
		}
		if (arg0 == 2) {
			var3 = NpcType.get(arg1).getHeadModel(true);
		}
		if (arg0 == 3) {
			var3 = client.localPlayer.getHeadModel((byte) -41);
		}
		if (arg0 == 4) {
			var3 = ObjType.get(arg1).getInvModel(50, true);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			modelCache.put(var3, (long) ((arg0 << 16) + arg1), (byte) 2);
		}
		return var3;
	}

	@ObfuscatedName("DUCMKFAY.a(IZLXTGLDHGX;Ljava/lang/String;)LCXGZMTJK;")
	public static Pix32 getImage(int arg0, boolean arg1, Jagfile arg2, String arg3) {
		long var4 = (JString.hashCode((byte) 1, arg3) << 8) + (long) arg0;
		if (arg1) {
			throw new NullPointerException();
		}
		Pix32 var6 = (Pix32) imageCache.get(var4);
		if (var6 != null) {
			return var6;
		}
		try {
			Pix32 var7 = new Pix32(arg2, arg3, arg0);
			imageCache.put(var7, var4, (byte) 2);
			return var7;
		} catch (Exception var8) {
			return null;
		}
	}

	@ObfuscatedName("DUCMKFAY.a(IZILZKARKDQW;)V")
	public static void cacheModel(int arg0, boolean arg1, int arg2, Model arg3) {
		if (!arg1) {
			modelCache.clear();
			if (arg3 != null && arg2 != 4) {
				modelCache.put(arg3, (long) ((arg2 << 16) + arg0), (byte) 2);
			}
		}
	}

	@ObfuscatedName("DUCMKFAY.a(IIIZ)LZKARKDQW;")
	public Model getModel(int arg0, int arg1, int arg2, boolean arg3) {
		Model var5;
		if (arg3) {
			var5 = this.getModel(this.activeModelType, this.activeModel);
		} else {
			var5 = this.getModel(this.modelType, this.model);
		}
		if (var5 == null) {
			return null;
		} else if (arg2 == -1 && arg1 == -1 && var5.faceColour == null) {
			return var5;
		} else {
			Model var6 = new Model(9, true, AnimFrame.isNull(arg2, false) & AnimFrame.isNull(arg1, false), false, var5);
			if (arg2 != -1 || arg1 != -1) {
				var6.createLabelReferences((byte) -71);
			}
			if (arg2 != -1) {
				var6.applyTransform(arg2, 40542);
			}
			if (arg1 != -1) {
				var6.applyTransform(arg1, 40542);
			}
			var6.calculateNormals(64, 768, -50, -10, -50, true);
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return var6;
		}
	}
}
