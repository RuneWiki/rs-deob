package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.dash3d.entity.Entity;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("ZKARKDQW")
public class Model extends Entity {

	@ObfuscatedName("ZKARKDQW.fb")
	public boolean picking = false;

	@ObfuscatedName("ZKARKDQW.y")
	public int vertexCount;

	@ObfuscatedName("ZKARKDQW.C")
	public int faceCount;

	@ObfuscatedName("ZKARKDQW.O")
	public int texturedFaceCount;

	@ObfuscatedName("ZKARKDQW.z")
	public int[] vertexX;

	@ObfuscatedName("ZKARKDQW.A")
	public int[] vertexY;

	@ObfuscatedName("ZKARKDQW.B")
	public int[] vertexZ;

	@ObfuscatedName("ZKARKDQW.D")
	public int[] faceVertexA;

	@ObfuscatedName("ZKARKDQW.E")
	public int[] faceVertexB;

	@ObfuscatedName("ZKARKDQW.F")
	public int[] faceVertexC;

	@ObfuscatedName("ZKARKDQW.P")
	public int[] texturedVertexA;

	@ObfuscatedName("ZKARKDQW.Q")
	public int[] texturedVertexB;

	@ObfuscatedName("ZKARKDQW.R")
	public int[] texturedVertexC;

	@ObfuscatedName("ZKARKDQW.bb")
	public int[] vertexLabel;

	@ObfuscatedName("ZKARKDQW.J")
	public int[] faceInfo;

	@ObfuscatedName("ZKARKDQW.K")
	public int[] facePriority;

	@ObfuscatedName("ZKARKDQW.N")
	public int priority;

	@ObfuscatedName("ZKARKDQW.L")
	public int[] faceAlpha;

	@ObfuscatedName("ZKARKDQW.cb")
	public int[] faceLabel;

	@ObfuscatedName("ZKARKDQW.M")
	public int[] faceColour;

	@ObfuscatedName("ZKARKDQW.G")
	public int[] faceColourA;

	@ObfuscatedName("ZKARKDQW.H")
	public int[] faceColourB;

	@ObfuscatedName("ZKARKDQW.I")
	public int[] faceColourC;

	@ObfuscatedName("ZKARKDQW.gb")
	public VertexNormal[] vertexNormalOriginal;

	@ObfuscatedName("ZKARKDQW.X")
	public int maxY;

	@ObfuscatedName("ZKARKDQW.W")
	public int radius;

	@ObfuscatedName("ZKARKDQW.Z")
	public int minDepth;

	@ObfuscatedName("ZKARKDQW.Y")
	public int maxDepth;

	@ObfuscatedName("ZKARKDQW.S")
	public int minX;

	@ObfuscatedName("ZKARKDQW.U")
	public int maxZ;

	@ObfuscatedName("ZKARKDQW.V")
	public int minZ;

	@ObfuscatedName("ZKARKDQW.T")
	public int maxX;

	@ObfuscatedName("ZKARKDQW.t")
	public static Model empty = new Model();

	@ObfuscatedName("ZKARKDQW.u")
	public static int[] tmpVertexX = new int[2000];

	@ObfuscatedName("ZKARKDQW.v")
	public static int[] tmpVertexY = new int[2000];

	@ObfuscatedName("ZKARKDQW.w")
	public static int[] tmpVertexZ = new int[2000];

	@ObfuscatedName("ZKARKDQW.x")
	public static int[] tmpFaceAlpha = new int[2000];

	@ObfuscatedName("ZKARKDQW.jb")
	public static boolean[] faceClippedX = new boolean[4096];

	@ObfuscatedName("ZKARKDQW.kb")
	public static boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("ZKARKDQW.lb")
	public static int[] vertexScreenX = new int[4096];

	@ObfuscatedName("ZKARKDQW.mb")
	public static int[] vertexScreenY = new int[4096];

	@ObfuscatedName("ZKARKDQW.nb")
	public static int[] vertexScreenZ = new int[4096];

	@ObfuscatedName("ZKARKDQW.ob")
	public static int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("ZKARKDQW.pb")
	public static int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("ZKARKDQW.qb")
	public static int[] vertexViewSpaceZ = new int[4096];

	@ObfuscatedName("ZKARKDQW.rb")
	public static int[] tmpDepthFaceCount = new int[1500];

	@ObfuscatedName("ZKARKDQW.sb")
	public static int[][] tmpDepthFaces = new int[1500][512];

	@ObfuscatedName("ZKARKDQW.tb")
	public static int[] tmpPriorityFaceCount = new int[12];

	@ObfuscatedName("ZKARKDQW.ub")
	public static int[][] tmpPriorityFaces = new int[12][2000];

	@ObfuscatedName("ZKARKDQW.vb")
	public static int[] tmpPriority10FaceDepth = new int[2000];

	@ObfuscatedName("ZKARKDQW.wb")
	public static int[] tmpPriority11FaceDepth = new int[2000];

	@ObfuscatedName("ZKARKDQW.xb")
	public static int[] tmpPriorityDepthSum = new int[12];

	@ObfuscatedName("ZKARKDQW.yb")
	public static int[] clippedX = new int[10];

	@ObfuscatedName("ZKARKDQW.zb")
	public static int[] clippedY = new int[10];

	@ObfuscatedName("ZKARKDQW.Ab")
	public static int[] clippedColour = new int[10];

	@ObfuscatedName("ZKARKDQW.Ib")
	public static int[] pickedBitsets = new int[1000];

	@ObfuscatedName("ZKARKDQW.Jb")
	public static int[] sin = Pix3D.sin;

	@ObfuscatedName("ZKARKDQW.Kb")
	public static int[] cos = Pix3D.cos;

	@ObfuscatedName("ZKARKDQW.Lb")
	public static int[] palette = Pix3D.palette;

	@ObfuscatedName("ZKARKDQW.Mb")
	public static int[] reciprocal16 = Pix3D.reciprocal16;

	@ObfuscatedName("ZKARKDQW.s")
	public static int loaded;

	@ObfuscatedName("ZKARKDQW.ab")
	public int objRaise;

	@ObfuscatedName("ZKARKDQW.Bb")
	public static int baseX;

	@ObfuscatedName("ZKARKDQW.Cb")
	public static int baseY;

	@ObfuscatedName("ZKARKDQW.Db")
	public static int baseZ;

	@ObfuscatedName("ZKARKDQW.Fb")
	public static int mouseX;

	@ObfuscatedName("ZKARKDQW.Gb")
	public static int mouseY;

	@ObfuscatedName("ZKARKDQW.Hb")
	public static int pickedCount;

	@ObfuscatedName("ZKARKDQW.ib")
	public static OnDemandProvider ondemand;

	@ObfuscatedName("ZKARKDQW.Eb")
	public static boolean checkHover;

	@ObfuscatedName("ZKARKDQW.hb")
	public static Metadata[] meta;

	@ObfuscatedName("ZKARKDQW.db")
	public int[][] labelVertices;

	@ObfuscatedName("ZKARKDQW.eb")
	public int[][] labelFaces;

	@ObfuscatedName("ZKARKDQW.b(I)V")
	public static void unload() {
		meta = null;
		faceClippedX = null;
		faceNearClipped = null;
		vertexScreenX = null;
		vertexScreenY = null;
		vertexScreenZ = null;
		vertexViewSpaceX = null;
		vertexViewSpaceY = null;
		vertexViewSpaceZ = null;
		tmpDepthFaceCount = null;
		tmpDepthFaces = null;
		tmpPriorityFaceCount = null;
		tmpPriorityFaces = null;
		tmpPriority10FaceDepth = null;
		tmpPriority11FaceDepth = null;
		tmpPriorityDepthSum = null;
		sin = null;
		cos = null;
		palette = null;
		reciprocal16 = null;
	}

	@ObfuscatedName("ZKARKDQW.a(ILVJKFYAWG;)V")
	public static void init(int arg0, OnDemandProvider arg1) {
		meta = new Metadata[arg0];
		ondemand = arg1;
	}

	@ObfuscatedName("ZKARKDQW.a([BII)V")
	public static void unpack(byte[] arg0, int arg1) {
		if (arg0 == null) {
			Metadata var2 = meta[arg1] = new Metadata();
			var2.vertexCount = 0;
			var2.faceCount = 0;
			var2.texturedFaceCount = 0;
		} else {
			Packet var3 = new Packet(arg0);
			var3.pos = arg0.length - 18;
			Metadata var4 = meta[arg1] = new Metadata();
			var4.data = arg0;
			var4.vertexCount = var3.g2();
			var4.faceCount = var3.g2();
			var4.texturedFaceCount = var3.g1();
			int var5 = var3.g1();
			int var6 = var3.g1();
			int var7 = var3.g1();
			int var8 = var3.g1();
			int var9 = var3.g1();
			int var10 = var3.g2();
			int var11 = var3.g2();
			int var12 = var3.g2();
			int var13 = var3.g2();
			int var14 = 0;
			var4.vertexFlagsOffset = var14;
			var14 += var4.vertexCount;
			var4.faceOrientationsOffset = var14;
			var14 += var4.faceCount;
			var4.facePrioritiesOffset = var14;
			if (var6 == 255) {
				var14 += var4.faceCount;
			} else {
				var4.facePrioritiesOffset = -var6 - 1;
			}

			var4.faceLabelsOffset = var14;
			if (var8 == 1) {
				var14 += var4.faceCount;
			} else {
				var4.faceLabelsOffset = -1;
			}

			var4.faceInfosOffset = var14;
			if (var5 == 1) {
				var14 += var4.faceCount;
			} else {
				var4.faceInfosOffset = -1;
			}

			var4.vertexLabelsOffset = var14;
			if (var9 == 1) {
				var14 += var4.vertexCount;
			} else {
				var4.vertexLabelsOffset = -1;
			}

			var4.faceAlphasOffset = var14;
			if (var7 == 1) {
				var14 += var4.faceCount;
			} else {
				var4.faceAlphasOffset = -1;
			}

			var4.faceVerticesOffset = var14;
			var14 += var13;
			var4.faceColorsOffset = var14;
			var14 += var4.faceCount * 2;
			var4.faceTextureAxisOffset = var14;
			var14 += var4.texturedFaceCount * 6;
			var4.vertexXOffset = var14;
			var14 += var10;
			var4.vertexYOffset = var14;
			var14 += var11;
			var4.vertexZOffset = var14;
			int var10000 = var12 + var14;
		}
	}

	@ObfuscatedName("ZKARKDQW.a(II)V")
	public static void unload(int arg0) {
		meta[arg0] = null;
	}

	@ObfuscatedName("ZKARKDQW.b(II)LZKARKDQW;")
	public static Model tryGet(int arg0) {
		if (meta == null) {
			return null;
		}

		Metadata var1 = meta[arg0];
		if (var1 == null) {
			ondemand.requestModel(arg0);
			return null;
		}

		return new Model(arg0);
	}

	@ObfuscatedName("ZKARKDQW.c(I)Z")
	public static boolean validate(int arg0) {
		if (meta == null) {
			return false;
		}

		Metadata var1 = meta[arg0];
		if (var1 == null) {
			ondemand.requestModel(arg0);
			return false;
		}

		return true;
	}

	public Model() {
	}

	public Model(int arg0) {
		loaded++;
		Metadata var2 = meta[arg0];
		vertexCount = var2.vertexCount;
		faceCount = var2.faceCount;
		texturedFaceCount = var2.texturedFaceCount;
		vertexX = new int[vertexCount];
		vertexY = new int[vertexCount];
		vertexZ = new int[vertexCount];
		faceVertexA = new int[faceCount];
		faceVertexB = new int[faceCount];
		faceVertexC = new int[faceCount];
		texturedVertexA = new int[texturedFaceCount];
		texturedVertexB = new int[texturedFaceCount];
		texturedVertexC = new int[texturedFaceCount];

		if (var2.vertexLabelsOffset >= 0) {
			vertexLabel = new int[vertexCount];
		}

		if (var2.faceInfosOffset >= 0) {
			faceInfo = new int[faceCount];
		}

		if (var2.facePrioritiesOffset >= 0) {
			facePriority = new int[faceCount];
		} else {
			priority = -var2.facePrioritiesOffset - 1;
		}

		if (var2.faceAlphasOffset >= 0) {
			faceAlpha = new int[faceCount];
		}

		if (var2.faceLabelsOffset >= 0) {
			faceLabel = new int[faceCount];
		}

		faceColour = new int[faceCount];
		Packet var3 = new Packet(var2.data);
		var3.pos = var2.vertexFlagsOffset;
		Packet var4 = new Packet(var2.data);
		var4.pos = var2.vertexXOffset;
		Packet var5 = new Packet(var2.data);
		var5.pos = var2.vertexYOffset;
		Packet var6 = new Packet(var2.data);
		var6.pos = var2.vertexZOffset;
		Packet var7 = new Packet(var2.data);
		var7.pos = var2.vertexLabelsOffset;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < vertexCount; var11++) {
			int var12 = var3.g1();
			int var13 = 0;
			if ((var12 & 0x1) != 0) {
				var13 = var4.gsmart();
			}

			int var14 = 0;
			if ((var12 & 0x2) != 0) {
				var14 = var5.gsmart();
			}

			int var15 = 0;
			if ((var12 & 0x4) != 0) {
				var15 = var6.gsmart();
			}

			vertexX[var11] = var8 + var13;
			vertexY[var11] = var9 + var14;
			vertexZ[var11] = var10 + var15;
			var8 = vertexX[var11];
			var9 = vertexY[var11];
			var10 = vertexZ[var11];

			if (vertexLabel != null) {
				vertexLabel[var11] = var7.g1();
			}
		}

		var3.pos = var2.faceColorsOffset;
		var4.pos = var2.faceInfosOffset;
		var5.pos = var2.facePrioritiesOffset;
		var6.pos = var2.faceAlphasOffset;
		var7.pos = var2.faceLabelsOffset;

		for (int var16 = 0; var16 < faceCount; var16++) {
			faceColour[var16] = var3.g2();

			if (faceInfo != null) {
				faceInfo[var16] = var4.g1();
			}

			if (facePriority != null) {
				facePriority[var16] = var5.g1();
			}

			if (faceAlpha != null) {
				faceAlpha[var16] = var6.g1();
			}

			if (faceLabel != null) {
				faceLabel[var16] = var7.g1();
			}
		}

		var3.pos = var2.faceVerticesOffset;
		var4.pos = var2.faceOrientationsOffset;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		for (int var21 = 0; var21 < faceCount; var21++) {
			int var22 = var4.g1();
			if (var22 == 1) {
				var17 = var3.gsmart() + var20;
				var18 = var3.gsmart() + var17;
				var19 = var3.gsmart() + var18;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var18;
				faceVertexC[var21] = var19;
			}

			if (var22 == 2) {
				var18 = var19;
				var19 = var3.gsmart() + var20;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var18;
				faceVertexC[var21] = var19;
			}

			if (var22 == 3) {
				var17 = var19;
				var19 = var3.gsmart() + var20;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var18;
				faceVertexC[var21] = var19;
			}

			if (var22 == 4) {
				int var25 = var17;
				var17 = var18;
				var18 = var25;
				var19 = var3.gsmart() + var20;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var25;
				faceVertexC[var21] = var19;
			}
		}

		var3.pos = var2.faceTextureAxisOffset;

		for (int var26 = 0; var26 < texturedFaceCount; var26++) {
			texturedVertexA[var26] = var3.g2();
			texturedVertexB[var26] = var3.g2();
			texturedVertexC[var26] = var3.g2();
		}
	}

	public Model(int arg0, Model[] arg1) {
		loaded++;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		vertexCount = 0;
		faceCount = 0;
		texturedFaceCount = 0;
		priority = -1;
		for (int var7 = 0; var7 < arg0; var7++) {
			Model var8 = arg1[var7];
			if (var8 != null) {
				vertexCount += var8.vertexCount;
				faceCount += var8.faceCount;
				texturedFaceCount += var8.texturedFaceCount;
				var3 |= var8.faceInfo != null;

				if (var8.facePriority == null) {
					if (priority == -1) {
						priority = var8.priority;
					}

					if (priority != var8.priority) {
						var4 = true;
					}
				} else {
					var4 = true;
				}

				var5 |= var8.faceAlpha != null;
				var6 |= var8.faceLabel != null;
			}
		}

		vertexX = new int[vertexCount];
		vertexY = new int[vertexCount];
		vertexZ = new int[vertexCount];
		vertexLabel = new int[vertexCount];
		faceVertexA = new int[faceCount];
		faceVertexB = new int[faceCount];
		faceVertexC = new int[faceCount];
		texturedVertexA = new int[texturedFaceCount];
		texturedVertexB = new int[texturedFaceCount];
		texturedVertexC = new int[texturedFaceCount];

		if (var3) {
			faceInfo = new int[faceCount];
		}

		if (var4) {
			facePriority = new int[faceCount];
		}

		if (var5) {
			faceAlpha = new int[faceCount];
		}

		if (var6) {
			faceLabel = new int[faceCount];
		}

		faceColour = new int[faceCount];
		vertexCount = 0;
		faceCount = 0;
		texturedFaceCount = 0;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0; var10++) {
			Model var11 = arg1[var10];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.faceCount; var12++) {
					if (var3) {
						if (var11.faceInfo == null) {
							faceInfo[faceCount] = 0;
						} else {
							int var13 = var11.faceInfo[var12];
							if ((var13 & 0x2) == 2) {
								var13 += var9 << 2;
							}

							faceInfo[faceCount] = var13;
						}
					}

					if (var4) {
						if (var11.facePriority == null) {
							facePriority[faceCount] = var11.priority;
						} else {
							facePriority[faceCount] = var11.facePriority[var12];
						}
					}

					if (var5) {
						if (var11.faceAlpha == null) {
							faceAlpha[faceCount] = 0;
						} else {
							faceAlpha[faceCount] = var11.faceAlpha[var12];
						}
					}

					if (var6 && var11.faceLabel != null) {
						faceLabel[faceCount] = var11.faceLabel[var12];
					}

					faceColour[faceCount] = var11.faceColour[var12];
					faceVertexA[faceCount] = addVertex(var11, var11.faceVertexA[var12]);
					faceVertexB[faceCount] = addVertex(var11, var11.faceVertexB[var12]);
					faceVertexC[faceCount] = addVertex(var11, var11.faceVertexC[var12]);
					faceCount++;
				}

				for (int var14 = 0; var14 < var11.texturedFaceCount; var14++) {
					texturedVertexA[texturedFaceCount] = addVertex(var11, var11.texturedVertexA[var14]);
					texturedVertexB[texturedFaceCount] = addVertex(var11, var11.texturedVertexB[var14]);
					texturedVertexC[texturedFaceCount] = addVertex(var11, var11.texturedVertexC[var14]);
					texturedFaceCount++;
				}

				var9 += var11.texturedFaceCount;
			}
		}
	}

	public Model(int arg0, boolean arg1, Model[] arg2) {
		loaded++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		vertexCount = 0;
		faceCount = 0;
		texturedFaceCount = 0;
		priority = -1;
		for (int var8 = 0; var8 < arg0; var8++) {
			Model var9 = arg2[var8];
			if (var9 != null) {
				vertexCount += var9.vertexCount;
				faceCount += var9.faceCount;
				texturedFaceCount += var9.texturedFaceCount;
				var4 |= var9.faceInfo != null;

				if (var9.facePriority == null) {
					if (priority == -1) {
						priority = var9.priority;
					}

					if (priority != var9.priority) {
						var5 = true;
					}
				} else {
					var5 = true;
				}

				var6 |= var9.faceAlpha != null;
				var7 |= var9.faceColour != null;
			}
		}

		vertexX = new int[vertexCount];
		vertexY = new int[vertexCount];
		vertexZ = new int[vertexCount];
		faceVertexA = new int[faceCount];
		faceVertexB = new int[faceCount];
		faceVertexC = new int[faceCount];
		faceColourA = new int[faceCount];
		faceColourB = new int[faceCount];
		faceColourC = new int[faceCount];
		texturedVertexA = new int[texturedFaceCount];
		texturedVertexB = new int[texturedFaceCount];
		texturedVertexC = new int[texturedFaceCount];

		if (var4) {
			faceInfo = new int[faceCount];
		}

		if (var5) {
			facePriority = new int[faceCount];
		}

		if (var6) {
			faceAlpha = new int[faceCount];
		}

		if (var7) {
			faceColour = new int[faceCount];
		}

		vertexCount = 0;
		faceCount = 0;
		texturedFaceCount = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < arg0; var11++) {
			Model var12 = arg2[var11];
			if (var12 != null) {
				int var13 = vertexCount;

				for (int var14 = 0; var14 < var12.vertexCount; var14++) {
					vertexX[vertexCount] = var12.vertexX[var14];
					vertexY[vertexCount] = var12.vertexY[var14];
					vertexZ[vertexCount] = var12.vertexZ[var14];
					vertexCount++;
				}

				for (int var15 = 0; var15 < var12.faceCount; var15++) {
					faceVertexA[faceCount] = var12.faceVertexA[var15] + var13;
					faceVertexB[faceCount] = var12.faceVertexB[var15] + var13;
					faceVertexC[faceCount] = var12.faceVertexC[var15] + var13;
					faceColourA[faceCount] = var12.faceColourA[var15];
					faceColourB[faceCount] = var12.faceColourB[var15];
					faceColourC[faceCount] = var12.faceColourC[var15];

					if (var4) {
						if (var12.faceInfo == null) {
							faceInfo[faceCount] = 0;
						} else {
							int var16 = var12.faceInfo[var15];
							if ((var16 & 0x2) == 2) {
								var16 += var10 << 2;
							}

							faceInfo[faceCount] = var16;
						}
					}

					if (var5) {
						if (var12.facePriority == null) {
							facePriority[faceCount] = var12.priority;
						} else {
							facePriority[faceCount] = var12.facePriority[var15];
						}
					}

					if (var6) {
						if (var12.faceAlpha == null) {
							faceAlpha[faceCount] = 0;
						} else {
							faceAlpha[faceCount] = var12.faceAlpha[var15];
						}
					}

					if (var7 && var12.faceColour != null) {
						faceColour[faceCount] = var12.faceColour[var15];
					}

					faceCount++;
				}

				for (int var17 = 0; var17 < var12.texturedFaceCount; var17++) {
					texturedVertexA[texturedFaceCount] = var12.texturedVertexA[var17] + var13;
					texturedVertexB[texturedFaceCount] = var12.texturedVertexB[var17] + var13;
					texturedVertexC[texturedFaceCount] = var12.texturedVertexC[var17] + var13;
					texturedFaceCount++;
				}

				var10 += var12.texturedFaceCount;
			}
		}

		calculateBoundsCylinder();
	}

	public Model(boolean arg0, boolean arg1, boolean arg2, Model arg3) {
		loaded++;
		vertexCount = arg3.vertexCount;
		faceCount = arg3.faceCount;
		texturedFaceCount = arg3.texturedFaceCount;

		if (arg2) {
			vertexX = arg3.vertexX;
			vertexY = arg3.vertexY;
			vertexZ = arg3.vertexZ;
		} else {
			vertexX = new int[vertexCount];
			vertexY = new int[vertexCount];
			vertexZ = new int[vertexCount];
			for (int var5 = 0; var5 < vertexCount; var5++) {
				vertexX[var5] = arg3.vertexX[var5];
				vertexY[var5] = arg3.vertexY[var5];
				vertexZ[var5] = arg3.vertexZ[var5];
			}
		}

		if (arg0) {
			faceColour = arg3.faceColour;
		} else {
			faceColour = new int[faceCount];
			for (int var6 = 0; var6 < faceCount; var6++) {
				faceColour[var6] = arg3.faceColour[var6];
			}
		}

		if (arg1) {
			faceAlpha = arg3.faceAlpha;
		} else {
			faceAlpha = new int[faceCount];
			if (arg3.faceAlpha == null) {
				for (int var7 = 0; var7 < faceCount; var7++) {
					faceAlpha[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < faceCount; var8++) {
					faceAlpha[var8] = arg3.faceAlpha[var8];
				}
			}
		}

		vertexLabel = arg3.vertexLabel;
		faceLabel = arg3.faceLabel;
		faceInfo = arg3.faceInfo;
		faceVertexA = arg3.faceVertexA;
		faceVertexB = arg3.faceVertexB;
		faceVertexC = arg3.faceVertexC;
		facePriority = arg3.facePriority;
		priority = arg3.priority;
		texturedVertexA = arg3.texturedVertexA;
		texturedVertexB = arg3.texturedVertexB;
		texturedVertexC = arg3.texturedVertexC;
	}

	public Model(boolean arg0, boolean arg1, Model arg2) {
		loaded++;
		vertexCount = arg2.vertexCount;
		faceCount = arg2.faceCount;
		texturedFaceCount = arg2.texturedFaceCount;

		if (arg0) {
			vertexY = new int[vertexCount];
			for (int var4 = 0; var4 < vertexCount; var4++) {
				vertexY[var4] = arg2.vertexY[var4];
			}
		} else {
			vertexY = arg2.vertexY;
		}

		if (arg1) {
			faceColourA = new int[faceCount];
			faceColourB = new int[faceCount];
			faceColourC = new int[faceCount];
			for (int var5 = 0; var5 < faceCount; var5++) {
				faceColourA[var5] = arg2.faceColourA[var5];
				faceColourB[var5] = arg2.faceColourB[var5];
				faceColourC[var5] = arg2.faceColourC[var5];
			}

			faceInfo = new int[faceCount];
			if (arg2.faceInfo == null) {
				for (int var6 = 0; var6 < faceCount; var6++) {
					faceInfo[var6] = 0;
				}
			} else {
				for (int var7 = 0; var7 < faceCount; var7++) {
					faceInfo[var7] = arg2.faceInfo[var7];
				}
			}

			vertexNormal = new VertexNormal[vertexCount];
			for (int var8 = 0; var8 < vertexCount; var8++) {
				VertexNormal var9 = vertexNormal[var8] = new VertexNormal();
				VertexNormal var10 = arg2.vertexNormal[var8];
				var9.x = var10.x;
				var9.y = var10.y;
				var9.z = var10.z;
				var9.w = var10.w;
			}

			vertexNormalOriginal = arg2.vertexNormalOriginal;
		} else {
			faceColourA = arg2.faceColourA;
			faceColourB = arg2.faceColourB;
			faceColourC = arg2.faceColourC;
			faceInfo = arg2.faceInfo;
		}

		vertexX = arg2.vertexX;
		vertexZ = arg2.vertexZ;
		faceColour = arg2.faceColour;
		faceAlpha = arg2.faceAlpha;
		facePriority = arg2.facePriority;
		priority = arg2.priority;
		faceVertexA = arg2.faceVertexA;
		faceVertexB = arg2.faceVertexB;
		faceVertexC = arg2.faceVertexC;
		texturedVertexA = arg2.texturedVertexA;
		texturedVertexB = arg2.texturedVertexB;
		texturedVertexC = arg2.texturedVertexC;
		minY = arg2.minY;
		maxY = arg2.maxY;
		radius = arg2.radius;
		minDepth = arg2.minDepth;
		maxDepth = arg2.maxDepth;
		minX = arg2.minX;
		maxZ = arg2.maxZ;
		minZ = arg2.minZ;
		maxX = arg2.maxX;
	}

	@ObfuscatedName("ZKARKDQW.a(ILZKARKDQW;Z)V")
	public void set(Model arg0, boolean arg1) {
		vertexCount = arg0.vertexCount;
		faceCount = arg0.faceCount;
		texturedFaceCount = arg0.texturedFaceCount;

		if (tmpVertexX.length < vertexCount) {
			tmpVertexX = new int[vertexCount + 100];
			tmpVertexY = new int[vertexCount + 100];
			tmpVertexZ = new int[vertexCount + 100];
		}

		vertexX = tmpVertexX;
		vertexY = tmpVertexY;
		vertexZ = tmpVertexZ;
		for (int var3 = 0; var3 < vertexCount; var3++) {
			vertexX[var3] = arg0.vertexX[var3];
			vertexY[var3] = arg0.vertexY[var3];
			vertexZ[var3] = arg0.vertexZ[var3];
		}

		if (arg1) {
			faceAlpha = arg0.faceAlpha;
		} else {
			if (tmpFaceAlpha.length < faceCount) {
				tmpFaceAlpha = new int[faceCount + 100];
			}

			faceAlpha = tmpFaceAlpha;
			if (arg0.faceAlpha == null) {
				for (int var4 = 0; var4 < faceCount; var4++) {
					faceAlpha[var4] = 0;
				}
			} else {
				for (int var5 = 0; var5 < faceCount; var5++) {
					faceAlpha[var5] = arg0.faceAlpha[var5];
				}
			}
		}

		faceInfo = arg0.faceInfo;
		faceColour = arg0.faceColour;
		facePriority = arg0.facePriority;
		priority = arg0.priority;
		labelFaces = arg0.labelFaces;
		labelVertices = arg0.labelVertices;
		faceVertexA = arg0.faceVertexA;
		faceVertexB = arg0.faceVertexB;
		faceVertexC = arg0.faceVertexC;
		faceColourA = arg0.faceColourA;
		faceColourB = arg0.faceColourB;
		faceColourC = arg0.faceColourC;
		texturedVertexA = arg0.texturedVertexA;
		texturedVertexB = arg0.texturedVertexB;
		texturedVertexC = arg0.texturedVertexC;
	}

	@ObfuscatedName("ZKARKDQW.a(LZKARKDQW;I)I")
	public final int addVertex(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.vertexX[arg1];
		int var5 = arg0.vertexY[arg1];
		int var6 = arg0.vertexZ[arg1];
		for (int var7 = 0; var7 < vertexCount; var7++) {
			if (vertexX[var7] == var4 && vertexY[var7] == var5 && vertexZ[var7] == var6) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			vertexX[vertexCount] = var4;
			vertexY[vertexCount] = var5;
			vertexZ[vertexCount] = var6;

			if (arg0.vertexLabel != null) {
				vertexLabel[vertexCount] = arg0.vertexLabel[arg1];
			}

			var3 = vertexCount++;
		}

		return var3;
	}

	@ObfuscatedName("ZKARKDQW.a(Z)V")
	public void calculateBoundsCylinder() {
		minY = 0;
		radius = 0;
		maxY = 0;
		for (int var1 = 0; var1 < vertexCount; var1++) {
			int var2 = vertexX[var1];
			int var3 = vertexY[var1];
			int var4 = vertexZ[var1];

			if (-var3 > minY) {
				minY = -var3;
			}

			if (var3 > maxY) {
				maxY = var3;
			}

			int var5 = var2 * var2 + var4 * var4;
			if (var5 > radius) {
				radius = var5;
			}
		}

		radius = (int) (Math.sqrt(radius) + 0.99D);
		minDepth = (int) (Math.sqrt(radius * radius + minY * minY) + 0.99D);
		maxDepth = minDepth + (int) (Math.sqrt(maxY * maxY + radius * radius) + 0.99D);
	}

	@ObfuscatedName("ZKARKDQW.b(Z)V")
	public void calculateBoundsY() {
		minY = 0;
		maxY = 0;
		for (int var1 = 0; var1 < vertexCount; var1++) {
			int var2 = vertexY[var1];
			if (-var2 > minY) {
				minY = -var2;
			}

			if (var2 > maxY) {
				maxY = var2;
			}
		}

		minDepth = (int) (Math.sqrt(radius * radius + minY * minY) + 0.99D);
		maxDepth = minDepth + (int) (Math.sqrt(maxY * maxY + radius * radius) + 0.99D);
	}

	@ObfuscatedName("ZKARKDQW.d(I)V")
	public void calculateBoundsAABB() {
		minY = 0;
		radius = 0;
		maxY = 0;
		minX = 999999;
		maxX = -999999;
		maxZ = -99999;
		minZ = 99999;
		for (int var1 = 0; var1 < vertexCount; var1++) {
			int var2 = vertexX[var1];
			int var3 = vertexY[var1];
			int var4 = vertexZ[var1];

			if (var2 < minX) {
				minX = var2;
			}

			if (var2 > maxX) {
				maxX = var2;
			}

			if (var4 < minZ) {
				minZ = var4;
			}

			if (var4 > maxZ) {
				maxZ = var4;
			}

			if (-var3 > minY) {
				minY = -var3;
			}

			if (var3 > maxY) {
				maxY = var3;
			}

			int var5 = var2 * var2 + var4 * var4;
			if (var5 > radius) {
				radius = var5;
			}
		}

		radius = (int) Math.sqrt(radius);
		minDepth = (int) Math.sqrt(radius * radius + minY * minY);
		maxDepth = minDepth + (int) Math.sqrt(maxY * maxY + radius * radius);
	}

	@ObfuscatedName("ZKARKDQW.a(B)V")
	public void createLabelReferences() {
		if (vertexLabel != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < vertexCount; var3++) {
				int var4 = vertexLabel[var3];
				var1[var4]++;

				if (var4 > var2) {
					var2 = var4;
				}
			}

			labelVertices = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				labelVertices[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}

			int var6 = 0;
			while (var6 < vertexCount) {
				int var7 = vertexLabel[var6];
				labelVertices[var7][var1[var7]++] = var6++;
			}

			vertexLabel = null;
		}

		if (faceLabel != null) {
			int[] var8 = new int[256];
			int var9 = 0;
			for (int var10 = 0; var10 < faceCount; var10++) {
				int var11 = faceLabel[var10];
				var8[var11]++;

				if (var11 > var9) {
					var9 = var11;
				}
			}

			labelFaces = new int[var9 + 1][];
			for (int var12 = 0; var12 <= var9; var12++) {
				labelFaces[var12] = new int[var8[var12]];
				var8[var12] = 0;
			}

			int var13 = 0;
			while (var13 < faceCount) {
				int var14 = faceLabel[var13];
				labelFaces[var14][var8[var14]++] = var13++;
			}

			faceLabel = null;
		}
	}

	@ObfuscatedName("ZKARKDQW.c(II)V")
	public void applyTransform(int arg0) {
		if (labelVertices != null && arg0 != -1) {
			AnimFrame var2 = AnimFrame.get(arg0);
			if (var2 != null) {
				AnimBase var3 = var2.base;
				baseX = 0;
				baseY = 0;
				baseZ = 0;

				for (int var4 = 0; var4 < var2.length; var4++) {
					int var5 = var2.groups[var4];
					applyTransform(var3.types[var5], var3.labels[var5], var2.x[var4], var2.y[var4], var2.z[var4]);
				}
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.a(I[III)V")
	public void applyTransforms(int[] arg0, int arg1, int arg2) {
		if (arg2 != -1) {
			if (arg0 == null || arg1 == -1) {
				applyTransform(arg2);
			} else {
				AnimFrame var4 = AnimFrame.get(arg2);
				if (var4 != null) {
					AnimFrame var5 = AnimFrame.get(arg1);
					if (var5 == null) {
						applyTransform(arg2);
					} else {
						AnimBase var6 = var4.base;
						baseX = 0;
						baseY = 0;
						baseZ = 0;
						byte var7 = 0;
						int var15 = var7 + 1;
						int var8 = arg0[var7];
						for (int var9 = 0; var9 < var4.length; var9++) {
							int var10 = var4.groups[var9];
							while (var10 > var8) {
								var8 = arg0[var15++];
							}

							if (var8 != var10 || var6.types[var10] == 0) {
								applyTransform(var6.types[var10], var6.labels[var10], var4.x[var9], var4.y[var9], var4.z[var9]);
							}
						}

						baseX = 0;
						baseY = 0;
						baseZ = 0;
						byte var11 = 0;
						int var16 = var11 + 1;
						int var12 = arg0[var11];
						for (int var13 = 0; var13 < var5.length; var13++) {
							int var14 = var5.groups[var13];
							while (var14 > var12) {
								var12 = arg0[var16++];
							}

							if (var12 == var14 || var6.types[var14] == 0) {
								applyTransform(var6.types[var14], var6.labels[var14], var5.x[var13], var5.y[var13], var5.z[var13]);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.a(I[IIII)V")
	public void applyTransform(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			baseX = 0;
			baseY = 0;
			baseZ = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < labelVertices.length) {
					int[] var10 = labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						baseX += vertexX[var12];
						baseY += vertexY[var12];
						baseZ += vertexZ[var12];
						var7++;
					}
				}
			}

			if (var7 > 0) {
				baseX = baseX / var7 + arg2;
				baseY = baseY / var7 + arg3;
				baseZ = baseZ / var7 + arg4;
			} else {
				baseX = arg2;
				baseY = arg3;
				baseZ = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < labelVertices.length) {
					int[] var15 = labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						vertexX[var17] += arg2;
						vertexY[var17] += arg3;
						vertexZ[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < labelVertices.length) {
					int[] var20 = labelVertices[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						vertexX[var22] -= baseX;
						vertexY[var22] -= baseY;
						vertexZ[var22] -= baseZ;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = sin[var25];
							int var27 = cos[var25];
							int var28 = vertexY[var22] * var26 + vertexX[var22] * var27 >> 16;
							vertexY[var22] = vertexY[var22] * var27 - vertexX[var22] * var26 >> 16;
							vertexX[var22] = var28;
						}

						if (var23 != 0) {
							int var29 = sin[var23];
							int var30 = cos[var23];
							int var31 = vertexY[var22] * var30 - vertexZ[var22] * var29 >> 16;
							vertexZ[var22] = vertexZ[var22] * var30 + vertexY[var22] * var29 >> 16;
							vertexY[var22] = var31;
						}

						if (var24 != 0) {
							int var32 = sin[var24];
							int var33 = cos[var24];
							int var34 = vertexZ[var22] * var32 + vertexX[var22] * var33 >> 16;
							vertexZ[var22] = vertexZ[var22] * var33 - vertexX[var22] * var32 >> 16;
							vertexX[var22] = var34;
						}

						vertexX[var22] += baseX;
						vertexY[var22] += baseY;
						vertexZ[var22] += baseZ;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < labelVertices.length) {
					int[] var37 = labelVertices[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						vertexX[var39] -= baseX;
						vertexY[var39] -= baseY;
						vertexZ[var39] -= baseZ;
						vertexX[var39] = vertexX[var39] * arg2 / 128;
						vertexY[var39] = vertexY[var39] * arg3 / 128;
						vertexZ[var39] = vertexZ[var39] * arg4 / 128;
						vertexX[var39] += baseX;
						vertexY[var39] += baseY;
						vertexZ[var39] += baseZ;
					}
				}
			}
		} else if (arg0 == 5 && (labelFaces != null && faceAlpha != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < labelFaces.length) {
					int[] var42 = labelFaces[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						faceAlpha[var44] += arg2 * 8;
						if (faceAlpha[var44] < 0) {
							faceAlpha[var44] = 0;
						}

						if (faceAlpha[var44] > 255) {
							faceAlpha[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.e(I)V")
	public void rotateY90() {
		for (int var1 = 0; var1 < vertexCount; var1++) {
			int var2 = vertexX[var1];
			vertexX[var1] = vertexZ[var1];
			vertexZ[var1] = -var2;
		}
	}

	@ObfuscatedName("ZKARKDQW.d(II)V")
	public void rotateX(int arg0) {
		int var2 = sin[arg0];
		int var3 = cos[arg0];
		for (int var4 = 0; var4 < vertexCount; var4++) {
			int var5 = vertexY[var4] * var3 - vertexZ[var4] * var2 >> 16;
			vertexZ[var4] = vertexZ[var4] * var3 + vertexY[var4] * var2 >> 16;
			vertexY[var4] = var5;
		}
	}

	@ObfuscatedName("ZKARKDQW.a(IIII)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < vertexCount; var4++) {
			vertexX[var4] += arg0;
			vertexY[var4] += arg1;
			vertexZ[var4] += arg2;
		}
	}

	@ObfuscatedName("ZKARKDQW.e(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < faceCount; var3++) {
			if (faceColour[var3] == arg0) {
				faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.f(I)V")
	public void rotateY180() {
		for (int var1 = 0; var1 < vertexCount; var1++) {
			vertexZ[var1] = -vertexZ[var1];
		}

		for (int var2 = 0; var2 < faceCount; var2++) {
			int var3 = faceVertexA[var2];
			faceVertexA[var2] = faceVertexC[var2];
			faceVertexC[var2] = var3;
		}
	}

	@ObfuscatedName("ZKARKDQW.b(IIII)V")
	public void scale(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < vertexCount; var4++) {
			vertexX[var4] = vertexX[var4] * arg0 / 128;
			vertexY[var4] = vertexY[var4] * arg2 / 128;
			vertexZ[var4] = vertexZ[var4] * arg1 / 128;
		}
	}

	@ObfuscatedName("ZKARKDQW.a(IIIIIZ)V")
	public final void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt(arg4 * arg4 + arg2 * arg2 + arg3 * arg3);
		int var8 = arg1 * var7 >> 8;

		if (faceColourA == null) {
			faceColourA = new int[faceCount];
			faceColourB = new int[faceCount];
			faceColourC = new int[faceCount];
		}

		if (vertexNormal == null) {
			vertexNormal = new VertexNormal[vertexCount];
			for (int var9 = 0; var9 < vertexCount; var9++) {
				vertexNormal[var9] = new VertexNormal();
			}
		}

		for (int var10 = 0; var10 < faceCount; var10++) {
			int var11 = faceVertexA[var10];
			int var12 = faceVertexB[var10];
			int var13 = faceVertexC[var10];
			int var14 = vertexX[var12] - vertexX[var11];
			int var15 = vertexY[var12] - vertexY[var11];
			int var16 = vertexZ[var12] - vertexZ[var11];
			int var17 = vertexX[var13] - vertexX[var11];
			int var18 = vertexY[var13] - vertexY[var11];
			int var19 = vertexZ[var13] - vertexZ[var11];
			int var20 = var15 * var19 - var16 * var18;
			int var21 = var16 * var17 - var14 * var19;
			int var22;
			for (var22 = var14 * var18 - var15 * var17; var20 > 8192 || var21 > 8192 || var22 > 8192 || var20 < -8192 || var21 < -8192 || var22 < -8192; var22 >>= 1) {
				var20 >>= 1;
				var21 >>= 1;
			}

			int var23 = (int) Math.sqrt(var22 * var22 + var20 * var20 + var21 * var21);
			if (var23 <= 0) {
				var23 = 1;
			}

			var20 = var20 * 256 / var23;
			var21 = var21 * 256 / var23;
			var22 = var22 * 256 / var23;
			if (faceInfo == null || (faceInfo[var10] & 0x1) == 0) {
				VertexNormal var24 = vertexNormal[var11];
				var24.x += var20;
				var24.y += var21;
				var24.z += var22;
				var24.w++;
				VertexNormal var25 = vertexNormal[var12];
				var25.x += var20;
				var25.y += var21;
				var25.z += var22;
				var25.w++;
				VertexNormal var26 = vertexNormal[var13];
				var26.x += var20;
				var26.y += var21;
				var26.z += var22;
				var26.w++;
			} else {
				int var27 = (arg4 * var22 + arg2 * var20 + arg3 * var21) / (var8 / 2 + var8) + arg0;
				faceColourA[var10] = mulColorLightness(faceColour[var10], var27, faceInfo[var10]);
			}
		}

		if (arg5) {
			applyLighting(arg0, var8, arg2, arg3, arg4);
		} else {
			vertexNormalOriginal = new VertexNormal[vertexCount];
			for (int var28 = 0; var28 < vertexCount; var28++) {
				VertexNormal var29 = vertexNormal[var28];
				VertexNormal var30 = vertexNormalOriginal[var28] = new VertexNormal();
				var30.x = var29.x;
				var30.y = var29.y;
				var30.z = var29.z;
				var30.w = var29.w;
			}
		}

		if (arg5) {
			calculateBoundsCylinder();
		} else {
			calculateBoundsAABB();
		}
	}

	@ObfuscatedName("ZKARKDQW.a(IIIII)V")
	public final void applyLighting(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < faceCount; var6++) {
			int var7 = faceVertexA[var6];
			int var8 = faceVertexB[var6];
			int var9 = faceVertexC[var6];
			if (faceInfo == null) {
				int var10 = faceColour[var6];
				VertexNormal var11 = vertexNormal[var7];
				int var12 = (var11.z * arg4 + var11.y * arg3 + var11.x * arg2) / (var11.w * arg1) + arg0;
				faceColourA[var6] = mulColorLightness(var10, var12, 0);
				VertexNormal var13 = vertexNormal[var8];
				int var14 = (var13.z * arg4 + var13.y * arg3 + var13.x * arg2) / (var13.w * arg1) + arg0;
				faceColourB[var6] = mulColorLightness(var10, var14, 0);
				VertexNormal var15 = vertexNormal[var9];
				int var16 = (var15.z * arg4 + var15.y * arg3 + var15.x * arg2) / (var15.w * arg1) + arg0;
				faceColourC[var6] = mulColorLightness(var10, var16, 0);
			} else if ((faceInfo[var6] & 0x1) == 0) {
				int var17 = faceColour[var6];
				int var18 = faceInfo[var6];
				VertexNormal var19 = vertexNormal[var7];
				int var20 = (var19.z * arg4 + var19.y * arg3 + var19.x * arg2) / (var19.w * arg1) + arg0;
				faceColourA[var6] = mulColorLightness(var17, var20, var18);
				VertexNormal var21 = vertexNormal[var8];
				int var22 = (var21.z * arg4 + var21.y * arg3 + var21.x * arg2) / (var21.w * arg1) + arg0;
				faceColourB[var6] = mulColorLightness(var17, var22, var18);
				VertexNormal var23 = vertexNormal[var9];
				int var24 = (var23.z * arg4 + var23.y * arg3 + var23.x * arg2) / (var23.w * arg1) + arg0;
				faceColourC[var6] = mulColorLightness(var17, var24, var18);
			}
		}

		vertexNormal = null;
		vertexNormalOriginal = null;
		vertexLabel = null;
		faceLabel = null;

		if (faceInfo != null) {
			for (int var25 = 0; var25 < faceCount; var25++) {
				if ((faceInfo[var25] & 0x2) == 2) {
					return;
				}
			}
		}

		faceColour = null;
	}

	@ObfuscatedName("ZKARKDQW.a(III)I")
	public static final int mulColorLightness(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}

			return 127 - arg1;
		}

		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}

		return (arg0 & 0xFF80) + arg1;
	}

	@ObfuscatedName("ZKARKDQW.a(IIIIIII)V")
	public final void drawSimple(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix3D.centerX;
		int var9 = Pix3D.centerY;
		int var10 = sin[arg0];
		int var11 = cos[arg0];
		int var12 = sin[arg1];
		int var13 = cos[arg1];
		int var14 = sin[arg2];
		int var15 = cos[arg2];
		int var16 = sin[arg3];
		int var17 = cos[arg3];
		int var18 = arg5 * var16 + arg6 * var17 >> 16;
		for (int var19 = 0; var19 < vertexCount; var19++) {
			int var20 = vertexX[var19];
			int var21 = vertexY[var19];
			int var22 = vertexZ[var19];

			if (arg2 != 0) {
				int var23 = var14 * var21 + var15 * var20 >> 16;
				var21 = var15 * var21 - var14 * var20 >> 16;
				var20 = var23;
			}

			if (arg0 != 0) {
				int var24 = var11 * var21 - var10 * var22 >> 16;
				var22 = var10 * var21 + var11 * var22 >> 16;
				var21 = var24;
			}

			if (arg1 != 0) {
				int var25 = var12 * var22 + var13 * var20 >> 16;
				var22 = var13 * var22 - var12 * var20 >> 16;
				var20 = var25;
			}

			var20 += arg4;
			var21 += arg5;
			var22 += arg6;
			int var26 = var17 * var21 - var16 * var22 >> 16;
			var22 = var16 * var21 + var17 * var22 >> 16;
			vertexScreenZ[var19] = var22 - var18;
			vertexScreenX[var19] = (var20 << 9) / var22 + var8;
			vertexScreenY[var19] = (var26 << 9) / var22 + var9;

			if (texturedFaceCount > 0) {
				vertexViewSpaceX[var19] = var20;
				vertexViewSpaceY[var19] = var26;
				vertexViewSpaceZ[var19] = var22;
			}
		}

		try {
			draw(false, false, 0);
		} catch (Exception var28) {
		}
	}

	@ObfuscatedName("ZKARKDQW.a(IIIIIIIII)V")
	public final void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = radius * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
			int var15 = var14 - radius << 9;
			if (var15 / var13 < Pix2D.centerX2d) {
				int var16 = radius + var14 << 9;
				if (var16 / var13 > -Pix2D.centerX2d) {
					int var17 = arg2 * arg6 - arg1 * var10 >> 16;
					int var18 = radius * arg1 >> 16;
					int var19 = var17 + var18 << 9;
					if (var19 / var13 > -Pix2D.centerY2d) {
						int var20 = (minY * arg2 >> 16) + var18;
						int var21 = var17 - var20 << 9;
						if (var21 / var13 < Pix2D.centerY2d) {
							int var22 = (minY * arg1 >> 16) + var12;
							boolean var23 = false;
							if (var11 - var22 <= 50) {
								var23 = true;
							}

							boolean var24 = false;
							if (arg8 > 0 && checkHover) {
								int var25 = var11 - var12;
								if (var25 <= 50) {
									var25 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var25;
								} else {
									var16 /= var13;
									var15 /= var25;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var25;
								} else {
									var19 /= var13;
									var21 /= var25;
								}

								int var26 = mouseX - Pix3D.centerX;
								int var27 = mouseY - Pix3D.centerY;
								if (var26 > var15 && var26 < var16 && var27 > var21 && var27 < var19) {
									if (picking) {
										pickedBitsets[pickedCount++] = arg8;
									} else {
										var24 = true;
									}
								}
							}

							int var28 = Pix3D.centerX;
							int var29 = Pix3D.centerY;
							int var30 = 0;
							int var31 = 0;
							if (arg0 != 0) {
								var30 = sin[arg0];
								var31 = cos[arg0];
							}

							for (int var32 = 0; var32 < vertexCount; var32++) {
								int var33 = vertexX[var32];
								int var34 = vertexY[var32];
								int var35 = vertexZ[var32];
								if (arg0 != 0) {
									int var36 = var30 * var35 + var31 * var33 >> 16;
									var35 = var31 * var35 - var30 * var33 >> 16;
									var33 = var36;
								}

								var33 += arg5;
								var34 += arg6;
								var35 += arg7;
								int var37 = arg3 * var35 + arg4 * var33 >> 16;
								var35 = arg4 * var35 - arg3 * var33 >> 16;
								int var39 = arg2 * var34 - arg1 * var35 >> 16;
								var35 = arg1 * var34 + arg2 * var35 >> 16;
								vertexScreenZ[var32] = var35 - var11;

								if (var35 >= 50) {
									vertexScreenX[var32] = (var37 << 9) / var35 + var28;
									vertexScreenY[var32] = (var39 << 9) / var35 + var29;
								} else {
									vertexScreenX[var32] = -5000;
									var23 = true;
								}

								if (var23 || texturedFaceCount > 0) {
									vertexViewSpaceX[var32] = var37;
									vertexViewSpaceY[var32] = var39;
									vertexViewSpaceZ[var32] = var35;
								}
							}

							try {
								draw(var23, var24, arg8);
							} catch (Exception var41) {
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.a(ZZI)V")
	public final void draw(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < maxDepth; var4++) {
			tmpDepthFaceCount[var4] = 0;
		}

		for (int var5 = 0; var5 < faceCount; var5++) {
			if (faceInfo == null || faceInfo[var5] != -1) {
				int var6 = faceVertexA[var5];
				int var7 = faceVertexB[var5];
				int var8 = faceVertexC[var5];
				int var9 = vertexScreenX[var6];
				int var10 = vertexScreenX[var7];
				int var11 = vertexScreenX[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					faceNearClipped[var5] = true;
					int var12 = (vertexScreenZ[var6] + vertexScreenZ[var7] + vertexScreenZ[var8]) / 3 + minDepth;
					tmpDepthFaces[var12][tmpDepthFaceCount[var12]++] = var5;
				} else {
					if (arg1 && pointWithinTriangle(mouseX, mouseY, vertexScreenY[var6], vertexScreenY[var7], vertexScreenY[var8], var9, var10, var11)) {
						pickedBitsets[pickedCount++] = arg2;
						arg1 = false;
					}

					if ((vertexScreenY[var8] - vertexScreenY[var7]) * (var9 - var10) - (vertexScreenY[var6] - vertexScreenY[var7]) * (var11 - var10) > 0) {
						faceNearClipped[var5] = false;

						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix2D.boundX && var10 <= Pix2D.boundX && var11 <= Pix2D.boundX) {
							faceClippedX[var5] = false;
						} else {
							faceClippedX[var5] = true;
						}

						int var13 = (vertexScreenZ[var6] + vertexScreenZ[var7] + vertexScreenZ[var8]) / 3 + minDepth;
						tmpDepthFaces[var13][tmpDepthFaceCount[var13]++] = var5;
					}
				}
			}
		}

		if (facePriority == null) {
			for (int var14 = maxDepth - 1; var14 >= 0; var14--) {
				int var15 = tmpDepthFaceCount[var14];
				if (var15 > 0) {
					int[] var16 = tmpDepthFaces[var14];
					for (int var17 = 0; var17 < var15; var17++) {
						drawFace(var16[var17]);
					}
				}
			}
		} else {
			for (int var18 = 0; var18 < 12; var18++) {
				tmpPriorityFaceCount[var18] = 0;
				tmpPriorityDepthSum[var18] = 0;
			}

			for (int var19 = maxDepth - 1; var19 >= 0; var19--) {
				int var20 = tmpDepthFaceCount[var19];
				if (var20 > 0) {
					int[] var21 = tmpDepthFaces[var19];
					for (int var22 = 0; var22 < var20; var22++) {
						int var23 = var21[var22];
						int var24 = facePriority[var23];
						int var25 = tmpPriorityFaceCount[var24]++;
						tmpPriorityFaces[var24][var25] = var23;

						if (var24 < 10) {
							tmpPriorityDepthSum[var24] += var19;
						} else if (var24 == 10) {
							tmpPriority10FaceDepth[var25] = var19;
						} else {
							tmpPriority11FaceDepth[var25] = var19;
						}
					}
				}
			}

			int var26 = 0;
			if (tmpPriorityFaceCount[1] > 0 || tmpPriorityFaceCount[2] > 0) {
				var26 = (tmpPriorityDepthSum[1] + tmpPriorityDepthSum[2]) / (tmpPriorityFaceCount[1] + tmpPriorityFaceCount[2]);
			}

			int var27 = 0;
			if (tmpPriorityFaceCount[3] > 0 || tmpPriorityFaceCount[4] > 0) {
				var27 = (tmpPriorityDepthSum[3] + tmpPriorityDepthSum[4]) / (tmpPriorityFaceCount[3] + tmpPriorityFaceCount[4]);
			}

			int var28 = 0;
			if (tmpPriorityFaceCount[6] > 0 || tmpPriorityFaceCount[8] > 0) {
				var28 = (tmpPriorityDepthSum[6] + tmpPriorityDepthSum[8]) / (tmpPriorityFaceCount[6] + tmpPriorityFaceCount[8]);
			}

			int var29 = 0;
			int var30 = tmpPriorityFaceCount[10];
			int[] var31 = tmpPriorityFaces[10];
			int[] var32 = tmpPriority10FaceDepth;
			if (var29 == var30) {
				var29 = 0;
				var30 = tmpPriorityFaceCount[11];
				var31 = tmpPriorityFaces[11];
				var32 = tmpPriority11FaceDepth;
			}

			int var33;
			if (var29 < var30) {
				var33 = var32[var29];
			} else {
				var33 = -1000;
			}

			for (int var34 = 0; var34 < 10; var34++) {
				while (var34 == 0 && var33 > var26) {
					drawFace(var31[var29++]);

					if (var29 == var30 && tmpPriorityFaces[11] != var31) {
						var29 = 0;
						var30 = tmpPriorityFaceCount[11];
						var31 = tmpPriorityFaces[11];
						var32 = tmpPriority11FaceDepth;
					}

					if (var29 < var30) {
						var33 = var32[var29];
					} else {
						var33 = -1000;
					}
				}

				while (var34 == 3 && var33 > var27) {
					drawFace(var31[var29++]);

					if (var29 == var30 && tmpPriorityFaces[11] != var31) {
						var29 = 0;
						var30 = tmpPriorityFaceCount[11];
						var31 = tmpPriorityFaces[11];
						var32 = tmpPriority11FaceDepth;
					}

					if (var29 < var30) {
						var33 = var32[var29];
					} else {
						var33 = -1000;
					}
				}

				while (var34 == 5 && var33 > var28) {
					drawFace(var31[var29++]);

					if (var29 == var30 && tmpPriorityFaces[11] != var31) {
						var29 = 0;
						var30 = tmpPriorityFaceCount[11];
						var31 = tmpPriorityFaces[11];
						var32 = tmpPriority11FaceDepth;
					}

					if (var29 < var30) {
						var33 = var32[var29];
					} else {
						var33 = -1000;
					}
				}

				int var35 = tmpPriorityFaceCount[var34];
				int[] var36 = tmpPriorityFaces[var34];
				for (int var37 = 0; var37 < var35; var37++) {
					drawFace(var36[var37]);
				}
			}

			while (var33 != -1000) {
				drawFace(var31[var29++]);

				if (var29 == var30 && tmpPriorityFaces[11] != var31) {
					var29 = 0;
					var31 = tmpPriorityFaces[11];
					var30 = tmpPriorityFaceCount[11];
					var32 = tmpPriority11FaceDepth;
				}

				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.g(I)V")
	public final void drawFace(int arg0) {
		if (faceNearClipped[arg0]) {
			drawNearClippedFace(arg0);
		} else {
			int var2 = faceVertexA[arg0];
			int var3 = faceVertexB[arg0];
			int var4 = faceVertexC[arg0];
			Pix3D.clipX = faceClippedX[arg0];

			if (faceAlpha == null) {
				Pix3D.alpha = 0;
			} else {
				Pix3D.alpha = faceAlpha[arg0];
			}

			int var5;
			if (faceInfo == null) {
				var5 = 0;
			} else {
				var5 = faceInfo[arg0] & 0x3;
			}

			if (var5 == 0) {
				Pix3D.fillGouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourB[arg0], faceColourC[arg0]);
			} else if (var5 == 1) {
				Pix3D.fillTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], palette[faceColourA[arg0]]);
			} else if (var5 == 2) {
				int var6 = faceInfo[arg0] >> 2;
				int var7 = texturedVertexA[var6];
				int var8 = texturedVertexB[var6];
				int var9 = texturedVertexC[var6];
				Pix3D.fillTexturedTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourB[arg0], faceColourC[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], faceColour[arg0]);
			} else if (var5 == 3) {
				int var10 = faceInfo[arg0] >> 2;
				int var11 = texturedVertexA[var10];
				int var12 = texturedVertexB[var10];
				int var13 = texturedVertexC[var10];
				Pix3D.fillTexturedTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var11], vertexViewSpaceX[var12], vertexViewSpaceX[var13], vertexViewSpaceY[var11], vertexViewSpaceY[var12], vertexViewSpaceY[var13], vertexViewSpaceZ[var11], vertexViewSpaceZ[var12], vertexViewSpaceZ[var13], faceColour[arg0]);
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.h(I)V")
	public final void drawNearClippedFace(int arg0) {
		int var2 = Pix3D.centerX;
		int var3 = Pix3D.centerY;
		int var4 = 0;
		int var5 = faceVertexA[arg0];
		int var6 = faceVertexB[arg0];
		int var7 = faceVertexC[arg0];
		int var8 = vertexViewSpaceZ[var5];
		int var9 = vertexViewSpaceZ[var6];
		int var10 = vertexViewSpaceZ[var7];
		if (var8 >= 50) {
			clippedX[var4] = vertexScreenX[var5];
			clippedY[var4] = vertexScreenY[var5];
			clippedColour[var4++] = faceColourA[arg0];
		} else {
			int var11 = vertexViewSpaceX[var5];
			int var12 = vertexViewSpaceY[var5];
			int var13 = faceColourA[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * reciprocal16[var10 - var8];
				clippedX[var4] = (((vertexViewSpaceX[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourC[arg0] - var13) * var14 >> 16) + var13;
			}

			if (var9 >= 50) {
				int var15 = (50 - var8) * reciprocal16[var9 - var8];
				clippedX[var4] = (((vertexViewSpaceX[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourB[arg0] - var13) * var15 >> 16) + var13;
			}
		}

		if (var9 >= 50) {
			clippedX[var4] = vertexScreenX[var6];
			clippedY[var4] = vertexScreenY[var6];
			clippedColour[var4++] = faceColourB[arg0];
		} else {
			int var16 = vertexViewSpaceX[var6];
			int var17 = vertexViewSpaceY[var6];
			int var18 = faceColourB[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * reciprocal16[var8 - var9];
				clippedX[var4] = (((vertexViewSpaceX[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourA[arg0] - var18) * var19 >> 16) + var18;
			}

			if (var10 >= 50) {
				int var20 = (50 - var9) * reciprocal16[var10 - var9];
				clippedX[var4] = (((vertexViewSpaceX[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourC[arg0] - var18) * var20 >> 16) + var18;
			}
		}

		if (var10 >= 50) {
			clippedX[var4] = vertexScreenX[var7];
			clippedY[var4] = vertexScreenY[var7];
			clippedColour[var4++] = faceColourC[arg0];
		} else {
			int var21 = vertexViewSpaceX[var7];
			int var22 = vertexViewSpaceY[var7];
			int var23 = faceColourC[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * reciprocal16[var9 - var10];
				clippedX[var4] = (((vertexViewSpaceX[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourB[arg0] - var23) * var24 >> 16) + var23;
			}

			if (var8 >= 50) {
				int var25 = (50 - var10) * reciprocal16[var8 - var10];
				clippedX[var4] = (((vertexViewSpaceX[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourA[arg0] - var23) * var25 >> 16) + var23;
			}
		}

		int var26 = clippedX[0];
		int var27 = clippedX[1];
		int var28 = clippedX[2];
		int var29 = clippedY[0];
		int var30 = clippedY[1];
		int var31 = clippedY[2];
		if ((var26 - var27) * (var31 - var30) - (var28 - var27) * (var29 - var30) > 0) {
			Pix3D.clipX = false;
			if (var4 == 3) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.boundX || var27 > Pix2D.boundX || var28 > Pix2D.boundX) {
					Pix3D.clipX = true;
				}

				int var32;
				if (faceInfo == null) {
					var32 = 0;
				} else {
					var32 = faceInfo[arg0] & 0x3;
				}

				if (var32 == 0) {
					Pix3D.fillGouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
				} else if (var32 == 1) {
					Pix3D.fillTriangle(var29, var30, var31, var26, var27, var28, palette[faceColourA[arg0]]);
				} else if (var32 == 2) {
					int var33 = faceInfo[arg0] >> 2;
					int var34 = texturedVertexA[var33];
					int var35 = texturedVertexB[var33];
					int var36 = texturedVertexC[var33];
					Pix3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceX[var36], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceY[var36], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], vertexViewSpaceZ[var36], faceColour[arg0]);
				} else if (var32 == 3) {
					int var37 = faceInfo[arg0] >> 2;
					int var38 = texturedVertexA[var37];
					int var39 = texturedVertexB[var37];
					int var40 = texturedVertexC[var37];
					Pix3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], faceColour[arg0]);
				}
			}

			if (var4 == 4) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.boundX || var27 > Pix2D.boundX || var28 > Pix2D.boundX || clippedX[3] < 0 || clippedX[3] > Pix2D.boundX) {
					Pix3D.clipX = true;
				}

				int var41;
				if (faceInfo == null) {
					var41 = 0;
				} else {
					var41 = faceInfo[arg0] & 0x3;
				}

				if (var41 == 0) {
					Pix3D.fillGouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
					Pix3D.fillGouraudTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
					return;
				}

				if (var41 == 1) {
					int var42 = palette[faceColourA[arg0]];
					Pix3D.fillTriangle(var29, var30, var31, var26, var27, var28, var42);
					Pix3D.fillTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], var42);
					return;
				}

				if (var41 == 2) {
					int var43 = faceInfo[arg0] >> 2;
					int var44 = texturedVertexA[var43];
					int var45 = texturedVertexB[var43];
					int var46 = texturedVertexC[var43];
					Pix3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], faceColour[arg0]);
					Pix3D.fillTexturedTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], faceColour[arg0]);
					return;
				}

				if (var41 == 3) {
					int var47 = faceInfo[arg0] >> 2;
					int var48 = texturedVertexA[var47];
					int var49 = texturedVertexB[var47];
					int var50 = texturedVertexC[var47];
					Pix3D.fillTexturedTriangle(var29, var30, var31, var26, var27, var28, faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], faceColour[arg0]);
					Pix3D.fillTexturedTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], faceColour[arg0]);
				}
			}
		}
	}

	@ObfuscatedName("ZKARKDQW.a(IIIIIIII)Z")
	public final boolean pointWithinTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		}

		if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		}

		if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		}

		if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		}

		return true;
	}
}
