package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.graphics.Pix2D;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("eb")
public class Model extends ModelSource {

	@ObfuscatedName("eb.s")
	public static int loaded;

	@ObfuscatedName("eb.t")
	public static Model tempModel = new Model();

	@ObfuscatedName("eb.u")
	public static int[] tmpVertexX = new int[2000];

	@ObfuscatedName("eb.v")
	public static int[] tmpVertexY = new int[2000];

	@ObfuscatedName("eb.w")
	public static int[] tmpVertexZ = new int[2000];

	@ObfuscatedName("eb.x")
	public static int[] tempFTran = new int[2000];

	@ObfuscatedName("eb.y")
	public int numPoints;

	@ObfuscatedName("eb.z")
	public int[] pointX;

	@ObfuscatedName("eb.ab")
	public int objRaise;

	@ObfuscatedName("eb.bb")
	public int[] vertexLabel;

	@ObfuscatedName("eb.cb")
	public int[] faceLabel;

	@ObfuscatedName("eb.db")
	public int[][] labelVertices;

	@ObfuscatedName("eb.eb")
	public int[][] labelFaces;

	@ObfuscatedName("eb.fb")
	public boolean useAABBMouseCheck = false;

	@ObfuscatedName("eb.gb")
	public PointNormal[] sharedPointNormal;

	@ObfuscatedName("eb.hb")
	public static Metadata[] meta;

	@ObfuscatedName("eb.ib")
	public static OnDemandProvider provider;

	@ObfuscatedName("eb.jb")
	public static boolean[] faceClippedX = new boolean[4096];

	@ObfuscatedName("eb.kb")
	public static boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("eb.lb")
	public static int[] vertexScreenX = new int[4096];

	@ObfuscatedName("eb.mb")
	public static int[] vertexScreenY = new int[4096];

	@ObfuscatedName("eb.nb")
	public static int[] vertexScreenZ = new int[4096];

	@ObfuscatedName("eb.ob")
	public static int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("eb.pb")
	public static int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("eb.qb")
	public static int[] vertexViewSpaceZ = new int[4096];

	@ObfuscatedName("eb.rb")
	public static int[] tmpDepthFaceCount = new int[1500];

	@ObfuscatedName("eb.sb")
	public static int[][] tmpDepthFaces = new int[1500][512];

	@ObfuscatedName("eb.tb")
	public static int[] tmpPriorityFaceCount = new int[12];

	@ObfuscatedName("eb.ub")
	public static int[][] tmpPriorityFaces = new int[12][2000];

	@ObfuscatedName("eb.vb")
	public static int[] tmpPriority10FaceDepth = new int[2000];

	@ObfuscatedName("eb.wb")
	public static int[] tmpPriority11FaceDepth = new int[2000];

	@ObfuscatedName("eb.xb")
	public static int[] tmpPriorityDepthSum = new int[12];

	@ObfuscatedName("eb.yb")
	public static int[] clippedX = new int[10];

	@ObfuscatedName("eb.zb")
	public static int[] clippedY = new int[10];

	@ObfuscatedName("eb.C")
	public int numFaces;

	@ObfuscatedName("eb.O")
	public int numT;

	@ObfuscatedName("eb.A")
	public int[] pointY;

	@ObfuscatedName("eb.B")
	public int[] pointZ;

	@ObfuscatedName("eb.D")
	public int[] faceVertexA;

	@ObfuscatedName("eb.E")
	public int[] faceVertexB;

	@ObfuscatedName("eb.F")
	public int[] faceVertexC;

	@ObfuscatedName("eb.P")
	public int[] faceTextureP;

	@ObfuscatedName("eb.Q")
	public int[] faceTextureM;

	@ObfuscatedName("eb.R")
	public int[] faceTextureN;

	@ObfuscatedName("eb.J")
	public int[] faceRenderType;

	@ObfuscatedName("eb.K")
	public int[] facePriority;

	@ObfuscatedName("eb.N")
	public int priority;

	@ObfuscatedName("eb.L")
	public int[] faceAlpha;

	@ObfuscatedName("eb.M")
	public int[] faceColour;

	@ObfuscatedName("eb.G")
	public int[] faceColourA;

	@ObfuscatedName("eb.H")
	public int[] faceColourB;

	@ObfuscatedName("eb.I")
	public int[] faceColourC;

	@ObfuscatedName("eb.X")
	public int maxY;

	@ObfuscatedName("eb.W")
	public int radius;

	@ObfuscatedName("eb.Z")
	public int minDepth;

	@ObfuscatedName("eb.Y")
	public int maxDepth;

	@ObfuscatedName("eb.S")
	public int minX;

	@ObfuscatedName("eb.U")
	public int maxZ;

	@ObfuscatedName("eb.V")
	public int minZ;

	@ObfuscatedName("eb.T")
	public int maxX;

	@ObfuscatedName("eb.Ab")
	public static int[] clippedColour = new int[10];

	@ObfuscatedName("eb.Ib")
	public static int[] pickedEntityTypecode = new int[1000];

	@ObfuscatedName("eb.Jb")
	public static int[] sinTable = Pix3D.sinTable;

	@ObfuscatedName("eb.Kb")
	public static int[] cosTable = Pix3D.cosTable;

	@ObfuscatedName("eb.Lb")
	public static int[] colourTable = Pix3D.colourTable;

	@ObfuscatedName("eb.Mb")
	public static int[] divTable2 = Pix3D.divTable2;

	@ObfuscatedName("eb.Bb")
	public static int oX;

	@ObfuscatedName("eb.Cb")
	public static int oY;

	@ObfuscatedName("eb.Db")
	public static int oZ;

	@ObfuscatedName("eb.Fb")
	public static int mouseX;

	@ObfuscatedName("eb.Gb")
	public static int mouseY;

	@ObfuscatedName("eb.Hb")
	public static int pickedCount;

	@ObfuscatedName("eb.Eb")
	public static boolean mouseCheck;

	@ObfuscatedName("eb.a(B)V")
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
		sinTable = null;
		cosTable = null;
		colourTable = null;
		divTable2 = null;
	}

	@ObfuscatedName("eb.a(ILtb;)V")
	public static void init(int arg0, OnDemandProvider arg1) {
		meta = new Metadata[arg0];
		provider = arg1;
	}

	@ObfuscatedName("eb.a([BIB)V")
	public static void unpack(byte[] arg0, int arg1) {
		if (arg0 == null) {
			Metadata var2 = meta[arg1] = new Metadata();
			var2.numPoints = 0;
			var2.numFaces = 0;
			var2.numT = 0;
		} else {
			Packet var3 = new Packet(arg0);
			var3.pos = arg0.length - 18;
			Metadata var4 = meta[arg1] = new Metadata();
			var4.src = arg0;
			var4.numPoints = var3.g2();
			var4.numFaces = var3.g2();
			var4.numT = var3.g1();
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
			var4.vertexOrderOffset = var14;
			var14 += var4.numPoints;
			var4.faceIndexOrderOffset = var14;
			var14 += var4.numFaces;
			var4.facePriorityOffset = var14;
			if (var6 == 255) {
				var14 += var4.numFaces;
			} else {
				var4.facePriorityOffset = -var6 - 1;
			}

			var4.faceLabelOffset = var14;
			if (var8 == 1) {
				var14 += var4.numFaces;
			} else {
				var4.faceLabelOffset = -1;
			}

			var4.faceRenderTypeOffset = var14;
			if (var5 == 1) {
				var14 += var4.numFaces;
			} else {
				var4.faceRenderTypeOffset = -1;
			}

			var4.vertexLabelOffset = var14;
			if (var9 == 1) {
				var14 += var4.numPoints;
			} else {
				var4.vertexLabelOffset = -1;
			}

			var4.faceAlphaOffset = var14;
			if (var7 == 1) {
				var14 += var4.numFaces;
			} else {
				var4.faceAlphaOffset = -1;
			}

			var4.faceIndexOffset = var14;
			var14 += var13;
			var4.faceColourOffset = var14;
			var14 += var4.numFaces * 2;
			var4.faceTextureAxisOffset = var14;
			var14 += var4.numT * 6;
			var4.vertexXOffset = var14;
			var14 += var10;
			var4.vertexYOffset = var14;
			var14 += var11;
			var4.vertexZOffset = var14;
			int var10000 = var12 + var14;
		}
	}

	@ObfuscatedName("eb.a(BI)V")
	public static void unload(int arg0) {
		meta[arg0] = null;
	}

	@ObfuscatedName("eb.a(IB)Leb;")
	public static Model load(int arg0) {
		if (meta == null) {
			return null;
		}

		Metadata var1 = meta[arg0];
		if (var1 == null) {
			provider.requestModel(arg0);
			return null;
		}

		return new Model(arg0);
	}

	@ObfuscatedName("eb.b(I)Z")
	public static boolean requestDownload(int arg0) {
		if (meta == null) {
			return false;
		}

		Metadata var1 = meta[arg0];
		if (var1 == null) {
			provider.requestModel(arg0);
			return false;
		}

		return true;
	}

	public Model() {
	}

	public Model(int arg0) {
		loaded++;
		Metadata var2 = meta[arg0];
		numPoints = var2.numPoints;
		numFaces = var2.numFaces;
		numT = var2.numT;
		pointX = new int[numPoints];
		pointY = new int[numPoints];
		pointZ = new int[numPoints];
		faceVertexA = new int[numFaces];
		faceVertexB = new int[numFaces];
		faceVertexC = new int[numFaces];
		faceTextureP = new int[numT];
		faceTextureM = new int[numT];
		faceTextureN = new int[numT];

		if (var2.vertexLabelOffset >= 0) {
			vertexLabel = new int[numPoints];
		}

		if (var2.faceRenderTypeOffset >= 0) {
			faceRenderType = new int[numFaces];
		}

		if (var2.facePriorityOffset >= 0) {
			facePriority = new int[numFaces];
		} else {
			priority = -var2.facePriorityOffset - 1;
		}

		if (var2.faceAlphaOffset >= 0) {
			faceAlpha = new int[numFaces];
		}

		if (var2.faceLabelOffset >= 0) {
			faceLabel = new int[numFaces];
		}

		faceColour = new int[numFaces];
		Packet var3 = new Packet(var2.src);
		var3.pos = var2.vertexOrderOffset;
		Packet var4 = new Packet(var2.src);
		var4.pos = var2.vertexXOffset;
		Packet var5 = new Packet(var2.src);
		var5.pos = var2.vertexYOffset;
		Packet var6 = new Packet(var2.src);
		var6.pos = var2.vertexZOffset;
		Packet var7 = new Packet(var2.src);
		var7.pos = var2.vertexLabelOffset;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < numPoints; var11++) {
			int var12 = var3.g1();
			int var13 = 0;
			if ((var12 & 0x1) != 0) {
				var13 = var4.gsmarts();
			}

			int var14 = 0;
			if ((var12 & 0x2) != 0) {
				var14 = var5.gsmarts();
			}

			int var15 = 0;
			if ((var12 & 0x4) != 0) {
				var15 = var6.gsmarts();
			}

			pointX[var11] = var8 + var13;
			pointY[var11] = var9 + var14;
			pointZ[var11] = var10 + var15;
			var8 = pointX[var11];
			var9 = pointY[var11];
			var10 = pointZ[var11];

			if (vertexLabel != null) {
				vertexLabel[var11] = var7.g1();
			}
		}

		var3.pos = var2.faceColourOffset;
		var4.pos = var2.faceRenderTypeOffset;
		var5.pos = var2.facePriorityOffset;
		var6.pos = var2.faceAlphaOffset;
		var7.pos = var2.faceLabelOffset;

		for (int var16 = 0; var16 < numFaces; var16++) {
			faceColour[var16] = var3.g2();

			if (faceRenderType != null) {
				faceRenderType[var16] = var4.g1();
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

		var3.pos = var2.faceIndexOffset;
		var4.pos = var2.faceIndexOrderOffset;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		for (int var21 = 0; var21 < numFaces; var21++) {
			int var22 = var4.g1();
			if (var22 == 1) {
				var17 = var3.gsmarts() + var20;
				var18 = var3.gsmarts() + var17;
				var19 = var3.gsmarts() + var18;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var18;
				faceVertexC[var21] = var19;
			}

			if (var22 == 2) {
				var18 = var19;
				var19 = var3.gsmarts() + var20;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var18;
				faceVertexC[var21] = var19;
			}

			if (var22 == 3) {
				var17 = var19;
				var19 = var3.gsmarts() + var20;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var18;
				faceVertexC[var21] = var19;
			}

			if (var22 == 4) {
				int var25 = var17;
				var17 = var18;
				var18 = var25;
				var19 = var3.gsmarts() + var20;
				var20 = var19;
				faceVertexA[var21] = var17;
				faceVertexB[var21] = var25;
				faceVertexC[var21] = var19;
			}
		}

		var3.pos = var2.faceTextureAxisOffset;

		for (int var26 = 0; var26 < numT; var26++) {
			faceTextureP[var26] = var3.g2();
			faceTextureM[var26] = var3.g2();
			faceTextureN[var26] = var3.g2();
		}
	}

	public Model(Model[] arg0, int arg1) {
		loaded++;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		priority = -1;
		for (int var7 = 0; var7 < arg1; var7++) {
			Model var8 = arg0[var7];
			if (var8 != null) {
				numPoints += var8.numPoints;
				numFaces += var8.numFaces;
				numT += var8.numT;
				var3 |= var8.faceRenderType != null;

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

		pointX = new int[numPoints];
		pointY = new int[numPoints];
		pointZ = new int[numPoints];
		vertexLabel = new int[numPoints];
		faceVertexA = new int[numFaces];
		faceVertexB = new int[numFaces];
		faceVertexC = new int[numFaces];
		faceTextureP = new int[numT];
		faceTextureM = new int[numT];
		faceTextureN = new int[numT];

		if (var3) {
			faceRenderType = new int[numFaces];
		}

		if (var4) {
			facePriority = new int[numFaces];
		}

		if (var5) {
			faceAlpha = new int[numFaces];
		}

		if (var6) {
			faceLabel = new int[numFaces];
		}

		faceColour = new int[numFaces];
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		int var9 = 0;
		for (int var10 = 0; var10 < arg1; var10++) {
			Model var11 = arg0[var10];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.numFaces; var12++) {
					if (var3) {
						if (var11.faceRenderType == null) {
							faceRenderType[numFaces] = 0;
						} else {
							int var13 = var11.faceRenderType[var12];
							if ((var13 & 0x2) == 2) {
								var13 += var9 << 2;
							}

							faceRenderType[numFaces] = var13;
						}
					}

					if (var4) {
						if (var11.facePriority == null) {
							facePriority[numFaces] = var11.priority;
						} else {
							facePriority[numFaces] = var11.facePriority[var12];
						}
					}

					if (var5) {
						if (var11.faceAlpha == null) {
							faceAlpha[numFaces] = 0;
						} else {
							faceAlpha[numFaces] = var11.faceAlpha[var12];
						}
					}

					if (var6 && var11.faceLabel != null) {
						faceLabel[numFaces] = var11.faceLabel[var12];
					}

					faceColour[numFaces] = var11.faceColour[var12];
					faceVertexA[numFaces] = addPoint(var11, var11.faceVertexA[var12]);
					faceVertexB[numFaces] = addPoint(var11, var11.faceVertexB[var12]);
					faceVertexC[numFaces] = addPoint(var11, var11.faceVertexC[var12]);
					numFaces++;
				}

				for (int var14 = 0; var14 < var11.numT; var14++) {
					faceTextureP[numT] = addPoint(var11, var11.faceTextureP[var14]);
					faceTextureM[numT] = addPoint(var11, var11.faceTextureM[var14]);
					faceTextureN[numT] = addPoint(var11, var11.faceTextureN[var14]);
					numT++;
				}

				var9 += var11.numT;
			}
		}
	}

	public Model(boolean arg0, Model[] arg1, int arg2) {
		loaded++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		priority = -1;
		for (int var8 = 0; var8 < arg2; var8++) {
			Model var9 = arg1[var8];
			if (var9 != null) {
				numPoints += var9.numPoints;
				numFaces += var9.numFaces;
				numT += var9.numT;
				var4 |= var9.faceRenderType != null;

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

		pointX = new int[numPoints];
		pointY = new int[numPoints];
		pointZ = new int[numPoints];
		faceVertexA = new int[numFaces];
		faceVertexB = new int[numFaces];
		faceVertexC = new int[numFaces];
		faceColourA = new int[numFaces];
		faceColourB = new int[numFaces];
		faceColourC = new int[numFaces];
		faceTextureP = new int[numT];
		faceTextureM = new int[numT];
		faceTextureN = new int[numT];

		if (var4) {
			faceRenderType = new int[numFaces];
		}

		if (var5) {
			facePriority = new int[numFaces];
		}

		if (var6) {
			faceAlpha = new int[numFaces];
		}

		if (var7) {
			faceColour = new int[numFaces];
		}

		numPoints = 0;
		numFaces = 0;
		numT = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < arg2; var11++) {
			Model var12 = arg1[var11];
			if (var12 != null) {
				int var13 = numPoints;

				for (int var14 = 0; var14 < var12.numPoints; var14++) {
					pointX[numPoints] = var12.pointX[var14];
					pointY[numPoints] = var12.pointY[var14];
					pointZ[numPoints] = var12.pointZ[var14];
					numPoints++;
				}

				for (int var15 = 0; var15 < var12.numFaces; var15++) {
					faceVertexA[numFaces] = var12.faceVertexA[var15] + var13;
					faceVertexB[numFaces] = var12.faceVertexB[var15] + var13;
					faceVertexC[numFaces] = var12.faceVertexC[var15] + var13;
					faceColourA[numFaces] = var12.faceColourA[var15];
					faceColourB[numFaces] = var12.faceColourB[var15];
					faceColourC[numFaces] = var12.faceColourC[var15];

					if (var4) {
						if (var12.faceRenderType == null) {
							faceRenderType[numFaces] = 0;
						} else {
							int var16 = var12.faceRenderType[var15];
							if ((var16 & 0x2) == 2) {
								var16 += var10 << 2;
							}

							faceRenderType[numFaces] = var16;
						}
					}

					if (var5) {
						if (var12.facePriority == null) {
							facePriority[numFaces] = var12.priority;
						} else {
							facePriority[numFaces] = var12.facePriority[var15];
						}
					}

					if (var6) {
						if (var12.faceAlpha == null) {
							faceAlpha[numFaces] = 0;
						} else {
							faceAlpha[numFaces] = var12.faceAlpha[var15];
						}
					}

					if (var7 && var12.faceColour != null) {
						faceColour[numFaces] = var12.faceColour[var15];
					}

					numFaces++;
				}

				for (int var17 = 0; var17 < var12.numT; var17++) {
					faceTextureP[numT] = var12.faceTextureP[var17] + var13;
					faceTextureM[numT] = var12.faceTextureM[var17] + var13;
					faceTextureN[numT] = var12.faceTextureN[var17] + var13;
					numT++;
				}

				var10 += var12.numT;
			}
		}

		calcBoundingCylinder();
	}

	public Model(Model arg0, boolean arg1, boolean arg2, boolean arg3) {
		loaded++;
		numPoints = arg0.numPoints;
		numFaces = arg0.numFaces;
		numT = arg0.numT;

		if (arg2) {
			pointX = arg0.pointX;
			pointY = arg0.pointY;
			pointZ = arg0.pointZ;
		} else {
			pointX = new int[numPoints];
			pointY = new int[numPoints];
			pointZ = new int[numPoints];
			for (int var5 = 0; var5 < numPoints; var5++) {
				pointX[var5] = arg0.pointX[var5];
				pointY[var5] = arg0.pointY[var5];
				pointZ[var5] = arg0.pointZ[var5];
			}
		}

		if (arg3) {
			faceColour = arg0.faceColour;
		} else {
			faceColour = new int[numFaces];
			for (int var6 = 0; var6 < numFaces; var6++) {
				faceColour[var6] = arg0.faceColour[var6];
			}
		}

		if (arg1) {
			faceAlpha = arg0.faceAlpha;
		} else {
			faceAlpha = new int[numFaces];
			if (arg0.faceAlpha == null) {
				for (int var7 = 0; var7 < numFaces; var7++) {
					faceAlpha[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < numFaces; var8++) {
					faceAlpha[var8] = arg0.faceAlpha[var8];
				}
			}
		}

		vertexLabel = arg0.vertexLabel;
		faceLabel = arg0.faceLabel;
		faceRenderType = arg0.faceRenderType;
		faceVertexA = arg0.faceVertexA;
		faceVertexB = arg0.faceVertexB;
		faceVertexC = arg0.faceVertexC;
		facePriority = arg0.facePriority;
		priority = arg0.priority;
		faceTextureP = arg0.faceTextureP;
		faceTextureM = arg0.faceTextureM;
		faceTextureN = arg0.faceTextureN;
	}

	public Model(boolean arg0, Model arg1, boolean arg2) {
		loaded++;
		numPoints = arg1.numPoints;
		numFaces = arg1.numFaces;
		numT = arg1.numT;

		if (arg2) {
			pointY = new int[numPoints];
			for (int var4 = 0; var4 < numPoints; var4++) {
				pointY[var4] = arg1.pointY[var4];
			}
		} else {
			pointY = arg1.pointY;
		}

		if (arg0) {
			faceColourA = new int[numFaces];
			faceColourB = new int[numFaces];
			faceColourC = new int[numFaces];
			for (int var5 = 0; var5 < numFaces; var5++) {
				faceColourA[var5] = arg1.faceColourA[var5];
				faceColourB[var5] = arg1.faceColourB[var5];
				faceColourC[var5] = arg1.faceColourC[var5];
			}

			faceRenderType = new int[numFaces];
			if (arg1.faceRenderType == null) {
				for (int var6 = 0; var6 < numFaces; var6++) {
					faceRenderType[var6] = 0;
				}
			} else {
				for (int var7 = 0; var7 < numFaces; var7++) {
					faceRenderType[var7] = arg1.faceRenderType[var7];
				}
			}

			pointNormal = new PointNormal[numPoints];
			for (int var8 = 0; var8 < numPoints; var8++) {
				PointNormal var9 = pointNormal[var8] = new PointNormal();
				PointNormal var10 = arg1.pointNormal[var8];
				var9.x = var10.x;
				var9.y = var10.y;
				var9.z = var10.z;
				var9.w = var10.w;
			}

			sharedPointNormal = arg1.sharedPointNormal;
		} else {
			faceColourA = arg1.faceColourA;
			faceColourB = arg1.faceColourB;
			faceColourC = arg1.faceColourC;
			faceRenderType = arg1.faceRenderType;
		}

		pointX = arg1.pointX;
		pointZ = arg1.pointZ;
		faceColour = arg1.faceColour;
		faceAlpha = arg1.faceAlpha;
		facePriority = arg1.facePriority;
		priority = arg1.priority;
		faceVertexA = arg1.faceVertexA;
		faceVertexB = arg1.faceVertexB;
		faceVertexC = arg1.faceVertexC;
		faceTextureP = arg1.faceTextureP;
		faceTextureM = arg1.faceTextureM;
		faceTextureN = arg1.faceTextureN;
		minY = arg1.minY;
		maxY = arg1.maxY;
		radius = arg1.radius;
		minDepth = arg1.minDepth;
		maxDepth = arg1.maxDepth;
		minX = arg1.minX;
		maxZ = arg1.maxZ;
		minZ = arg1.minZ;
		maxX = arg1.maxX;
	}

	@ObfuscatedName("eb.a(ZLeb;I)V")
	public void set(boolean arg0, Model arg1) {
		numPoints = arg1.numPoints;
		numFaces = arg1.numFaces;
		numT = arg1.numT;

		if (tmpVertexX.length < numPoints) {
			tmpVertexX = new int[numPoints + 100];
			tmpVertexY = new int[numPoints + 100];
			tmpVertexZ = new int[numPoints + 100];
		}

		pointX = tmpVertexX;
		pointY = tmpVertexY;
		pointZ = tmpVertexZ;
		for (int var3 = 0; var3 < numPoints; var3++) {
			pointX[var3] = arg1.pointX[var3];
			pointY[var3] = arg1.pointY[var3];
			pointZ[var3] = arg1.pointZ[var3];
		}

		if (arg0) {
			faceAlpha = arg1.faceAlpha;
		} else {
			if (tempFTran.length < numFaces) {
				tempFTran = new int[numFaces + 100];
			}

			faceAlpha = tempFTran;
			if (arg1.faceAlpha == null) {
				for (int var4 = 0; var4 < numFaces; var4++) {
					faceAlpha[var4] = 0;
				}
			} else {
				for (int var5 = 0; var5 < numFaces; var5++) {
					faceAlpha[var5] = arg1.faceAlpha[var5];
				}
			}
		}

		faceRenderType = arg1.faceRenderType;
		faceColour = arg1.faceColour;
		facePriority = arg1.facePriority;
		priority = arg1.priority;
		labelFaces = arg1.labelFaces;
		labelVertices = arg1.labelVertices;
		faceVertexA = arg1.faceVertexA;
		faceVertexB = arg1.faceVertexB;
		faceVertexC = arg1.faceVertexC;
		faceColourA = arg1.faceColourA;
		faceColourB = arg1.faceColourB;
		faceColourC = arg1.faceColourC;
		faceTextureP = arg1.faceTextureP;
		faceTextureM = arg1.faceTextureM;
		faceTextureN = arg1.faceTextureN;
	}

	@ObfuscatedName("eb.a(Leb;I)I")
	public final int addPoint(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.pointX[arg1];
		int var5 = arg0.pointY[arg1];
		int var6 = arg0.pointZ[arg1];
		for (int var7 = 0; var7 < numPoints; var7++) {
			if (pointX[var7] == var4 && pointY[var7] == var5 && pointZ[var7] == var6) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			pointX[numPoints] = var4;
			pointY[numPoints] = var5;
			pointZ[numPoints] = var6;

			if (arg0.vertexLabel != null) {
				vertexLabel[numPoints] = arg0.vertexLabel[arg1];
			}

			var3 = numPoints++;
		}

		return var3;
	}

	@ObfuscatedName("eb.c(I)V")
	public void calcBoundingCylinder() {
		minY = 0;
		radius = 0;
		maxY = 0;
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointX[var1];
			int var3 = pointY[var1];
			int var4 = pointZ[var1];

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

	@ObfuscatedName("eb.d(I)V")
	public void recalcBoundingCylinder() {
		minY = 0;
		maxY = 0;
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointY[var1];
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

	@ObfuscatedName("eb.e(I)V")
	public void calcBoundingCube() {
		minY = 0;
		radius = 0;
		maxY = 0;
		minX = 999999;
		maxX = -999999;
		maxZ = -99999;
		minZ = 99999;
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointX[var1];
			int var3 = pointY[var1];
			int var4 = pointZ[var1];

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

	@ObfuscatedName("eb.b(B)V")
	public void prepareAnim() {
		if (vertexLabel != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < numPoints; var3++) {
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
			while (var6 < numPoints) {
				int var7 = vertexLabel[var6];
				labelVertices[var7][var1[var7]++] = var6++;
			}

			vertexLabel = null;
		}

		if (faceLabel != null) {
			int[] var8 = new int[256];
			int var9 = 0;
			for (int var10 = 0; var10 < numFaces; var10++) {
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
			while (var13 < numFaces) {
				int var14 = faceLabel[var13];
				labelFaces[var14][var8[var14]++] = var13++;
			}

			faceLabel = null;
		}
	}

	@ObfuscatedName("eb.a(II)V")
	public void animate(int arg0) {
		if (labelVertices != null && arg0 != -1) {
			AnimFrame var2 = AnimFrame.get(arg0);
			if (var2 != null) {
				AnimBase var3 = var2.base;
				oX = 0;
				oY = 0;
				oZ = 0;

				for (int var4 = 0; var4 < var2.size; var4++) {
					int var5 = var2.ti[var4];
					animate2(var3.type[var5], var3.labels[var5], var2.tx[var4], var2.ty[var4], var2.tz[var4]);
				}
			}
		}
	}

	@ObfuscatedName("eb.a(IZI[I)V")
	public void maskAnimate(int arg0, int arg1, int[] arg2) {
		if (arg0 != -1) {
			if (arg2 == null || arg1 == -1) {
				animate(arg0);
			} else {
				AnimFrame var4 = AnimFrame.get(arg0);
				if (var4 != null) {
					AnimFrame var5 = AnimFrame.get(arg1);
					if (var5 == null) {
						animate(arg0);
					} else {
						AnimBase var6 = var4.base;
						oX = 0;
						oY = 0;
						oZ = 0;
						byte var7 = 0;
						int var15 = var7 + 1;
						int var8 = arg2[var7];
						for (int var9 = 0; var9 < var4.size; var9++) {
							int var10 = var4.ti[var9];
							while (var10 > var8) {
								var8 = arg2[var15++];
							}

							if (var8 != var10 || var6.type[var10] == 0) {
								animate2(var6.type[var10], var6.labels[var10], var4.tx[var9], var4.ty[var9], var4.tz[var9]);
							}
						}

						oX = 0;
						oY = 0;
						oZ = 0;
						byte var11 = 0;
						int var16 = var11 + 1;
						int var12 = arg2[var11];
						for (int var13 = 0; var13 < var5.size; var13++) {
							int var14 = var5.ti[var13];
							while (var14 > var12) {
								var12 = arg2[var16++];
							}

							if (var12 == var14 || var6.type[var14] == 0) {
								animate2(var6.type[var14], var6.labels[var14], var5.tx[var13], var5.ty[var13], var5.tz[var13]);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I[IIII)V")
	public void animate2(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			oX = 0;
			oY = 0;
			oZ = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < labelVertices.length) {
					int[] var10 = labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						oX += pointX[var12];
						oY += pointY[var12];
						oZ += pointZ[var12];
						var7++;
					}
				}
			}

			if (var7 > 0) {
				oX = oX / var7 + arg2;
				oY = oY / var7 + arg3;
				oZ = oZ / var7 + arg4;
			} else {
				oX = arg2;
				oY = arg3;
				oZ = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < labelVertices.length) {
					int[] var15 = labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						pointX[var17] += arg2;
						pointY[var17] += arg3;
						pointZ[var17] += arg4;
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
						pointX[var22] -= oX;
						pointY[var22] -= oY;
						pointZ[var22] -= oZ;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = sinTable[var25];
							int var27 = cosTable[var25];
							int var28 = pointY[var22] * var26 + pointX[var22] * var27 >> 16;
							pointY[var22] = pointY[var22] * var27 - pointX[var22] * var26 >> 16;
							pointX[var22] = var28;
						}

						if (var23 != 0) {
							int var29 = sinTable[var23];
							int var30 = cosTable[var23];
							int var31 = pointY[var22] * var30 - pointZ[var22] * var29 >> 16;
							pointZ[var22] = pointZ[var22] * var30 + pointY[var22] * var29 >> 16;
							pointY[var22] = var31;
						}

						if (var24 != 0) {
							int var32 = sinTable[var24];
							int var33 = cosTable[var24];
							int var34 = pointZ[var22] * var32 + pointX[var22] * var33 >> 16;
							pointZ[var22] = pointZ[var22] * var33 - pointX[var22] * var32 >> 16;
							pointX[var22] = var34;
						}

						pointX[var22] += oX;
						pointY[var22] += oY;
						pointZ[var22] += oZ;
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
						pointX[var39] -= oX;
						pointY[var39] -= oY;
						pointZ[var39] -= oZ;
						pointX[var39] = pointX[var39] * arg2 / 128;
						pointY[var39] = pointY[var39] * arg3 / 128;
						pointZ[var39] = pointZ[var39] * arg4 / 128;
						pointX[var39] += oX;
						pointY[var39] += oY;
						pointZ[var39] += oZ;
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

	@ObfuscatedName("eb.f(I)V")
	public void rotate90() {
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointX[var1];
			pointX[var1] = pointZ[var1];
			pointZ[var1] = -var2;
		}
	}

	@ObfuscatedName("eb.b(II)V")
	public void rotateXAxis(int arg0) {
		int var2 = sinTable[arg0];
		int var3 = cosTable[arg0];
		for (int var4 = 0; var4 < numPoints; var4++) {
			int var5 = pointY[var4] * var3 - pointZ[var4] * var2 >> 16;
			pointZ[var4] = pointZ[var4] * var3 + pointY[var4] * var2 >> 16;
			pointY[var4] = var5;
		}
	}

	@ObfuscatedName("eb.a(IIBI)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numPoints; var4++) {
			pointX[var4] += arg1;
			pointY[var4] += arg0;
			pointZ[var4] += arg2;
		}
	}

	@ObfuscatedName("eb.c(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < numFaces; var3++) {
			if (faceColour[var3] == arg0) {
				faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("eb.g(I)V")
	public void mirror() {
		for (int var1 = 0; var1 < numPoints; var1++) {
			pointZ[var1] = -pointZ[var1];
		}

		for (int var2 = 0; var2 < numFaces; var2++) {
			int var3 = faceVertexA[var2];
			faceVertexA[var2] = faceVertexC[var2];
			faceVertexC[var2] = var3;
		}
	}

	@ObfuscatedName("eb.a(IIIB)V")
	public void resize(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numPoints; var4++) {
			pointX[var4] = pointX[var4] * arg0 / 128;
			pointY[var4] = pointY[var4] * arg2 / 128;
			pointZ[var4] = pointZ[var4] * arg1 / 128;
		}
	}

	@ObfuscatedName("eb.a(IIIIIZ)V")
	public final void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt(arg4 * arg4 + arg2 * arg2 + arg3 * arg3);
		int var8 = arg1 * var7 >> 8;

		if (faceColourA == null) {
			faceColourA = new int[numFaces];
			faceColourB = new int[numFaces];
			faceColourC = new int[numFaces];
		}

		if (pointNormal == null) {
			pointNormal = new PointNormal[numPoints];
			for (int var9 = 0; var9 < numPoints; var9++) {
				pointNormal[var9] = new PointNormal();
			}
		}

		for (int var10 = 0; var10 < numFaces; var10++) {
			int var11 = faceVertexA[var10];
			int var12 = faceVertexB[var10];
			int var13 = faceVertexC[var10];
			int var14 = pointX[var12] - pointX[var11];
			int var15 = pointY[var12] - pointY[var11];
			int var16 = pointZ[var12] - pointZ[var11];
			int var17 = pointX[var13] - pointX[var11];
			int var18 = pointY[var13] - pointY[var11];
			int var19 = pointZ[var13] - pointZ[var11];
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
			if (faceRenderType == null || (faceRenderType[var10] & 0x1) == 0) {
				PointNormal var24 = pointNormal[var11];
				var24.x += var20;
				var24.y += var21;
				var24.z += var22;
				var24.w++;
				PointNormal var25 = pointNormal[var12];
				var25.x += var20;
				var25.y += var21;
				var25.z += var22;
				var25.w++;
				PointNormal var26 = pointNormal[var13];
				var26.x += var20;
				var26.y += var21;
				var26.z += var22;
				var26.w++;
			} else {
				int var27 = (arg4 * var22 + arg2 * var20 + arg3 * var21) / (var8 / 2 + var8) + arg0;
				faceColourA[var10] = getColour(faceColour[var10], var27, faceRenderType[var10]);
			}
		}

		if (arg5) {
			light(arg0, var8, arg2, arg3, arg4);
		} else {
			sharedPointNormal = new PointNormal[numPoints];
			for (int var28 = 0; var28 < numPoints; var28++) {
				PointNormal var29 = pointNormal[var28];
				PointNormal var30 = sharedPointNormal[var28] = new PointNormal();
				var30.x = var29.x;
				var30.y = var29.y;
				var30.z = var29.z;
				var30.w = var29.w;
			}
		}

		if (arg5) {
			calcBoundingCylinder();
		} else {
			calcBoundingCube();
		}
	}

	@ObfuscatedName("eb.a(IIIII)V")
	public final void light(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < numFaces; var6++) {
			int var7 = faceVertexA[var6];
			int var8 = faceVertexB[var6];
			int var9 = faceVertexC[var6];
			if (faceRenderType == null) {
				int var10 = faceColour[var6];
				PointNormal var11 = pointNormal[var7];
				int var12 = (var11.z * arg4 + var11.y * arg3 + var11.x * arg2) / (var11.w * arg1) + arg0;
				faceColourA[var6] = getColour(var10, var12, 0);
				PointNormal var13 = pointNormal[var8];
				int var14 = (var13.z * arg4 + var13.y * arg3 + var13.x * arg2) / (var13.w * arg1) + arg0;
				faceColourB[var6] = getColour(var10, var14, 0);
				PointNormal var15 = pointNormal[var9];
				int var16 = (var15.z * arg4 + var15.y * arg3 + var15.x * arg2) / (var15.w * arg1) + arg0;
				faceColourC[var6] = getColour(var10, var16, 0);
			} else if ((faceRenderType[var6] & 0x1) == 0) {
				int var17 = faceColour[var6];
				int var18 = faceRenderType[var6];
				PointNormal var19 = pointNormal[var7];
				int var20 = (var19.z * arg4 + var19.y * arg3 + var19.x * arg2) / (var19.w * arg1) + arg0;
				faceColourA[var6] = getColour(var17, var20, var18);
				PointNormal var21 = pointNormal[var8];
				int var22 = (var21.z * arg4 + var21.y * arg3 + var21.x * arg2) / (var21.w * arg1) + arg0;
				faceColourB[var6] = getColour(var17, var22, var18);
				PointNormal var23 = pointNormal[var9];
				int var24 = (var23.z * arg4 + var23.y * arg3 + var23.x * arg2) / (var23.w * arg1) + arg0;
				faceColourC[var6] = getColour(var17, var24, var18);
			}
		}

		pointNormal = null;
		sharedPointNormal = null;
		vertexLabel = null;
		faceLabel = null;

		if (faceRenderType != null) {
			for (int var25 = 0; var25 < numFaces; var25++) {
				if ((faceRenderType[var25] & 0x2) == 2) {
					return;
				}
			}
		}

		faceColour = null;
	}

	@ObfuscatedName("eb.a(III)I")
	public static final int getColour(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("eb.a(IIIIIII)V")
	public final void objRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix3D.originX;
		int var9 = Pix3D.originY;
		int var10 = sinTable[arg0];
		int var11 = cosTable[arg0];
		int var12 = sinTable[arg1];
		int var13 = cosTable[arg1];
		int var14 = sinTable[arg2];
		int var15 = cosTable[arg2];
		int var16 = sinTable[arg3];
		int var17 = cosTable[arg3];
		int var18 = arg5 * var16 + arg6 * var17 >> 16;
		for (int var19 = 0; var19 < numPoints; var19++) {
			int var20 = pointX[var19];
			int var21 = pointY[var19];
			int var22 = pointZ[var19];

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

			if (numT > 0) {
				vertexViewSpaceX[var19] = var20;
				vertexViewSpaceY[var19] = var26;
				vertexViewSpaceZ[var19] = var22;
			}
		}

		try {
			render2(false, false, 0);
		} catch (Exception var28) {
		}
	}

	@ObfuscatedName("eb.a(IIIIIIIII)V")
	public final void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = radius * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
			int var15 = var14 - radius << 9;
			if (var15 / var13 < Pix2D.maxX) {
				int var16 = radius + var14 << 9;
				if (var16 / var13 > -Pix2D.maxX) {
					int var17 = arg2 * arg6 - arg1 * var10 >> 16;
					int var18 = radius * arg1 >> 16;
					int var19 = var17 + var18 << 9;
					if (var19 / var13 > -Pix2D.maxY) {
						int var20 = (minY * arg2 >> 16) + var18;
						int var21 = var17 - var20 << 9;
						if (var21 / var13 < Pix2D.maxY) {
							int var22 = (minY * arg1 >> 16) + var12;
							boolean var23 = false;
							if (var11 - var22 <= 50) {
								var23 = true;
							}

							boolean var24 = false;
							if (arg8 > 0 && mouseCheck) {
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

								int var26 = mouseX - Pix3D.originX;
								int var27 = mouseY - Pix3D.originY;
								if (var26 > var15 && var26 < var16 && var27 > var21 && var27 < var19) {
									if (useAABBMouseCheck) {
										pickedEntityTypecode[pickedCount++] = arg8;
									} else {
										var24 = true;
									}
								}
							}

							int var28 = Pix3D.originX;
							int var29 = Pix3D.originY;
							int var30 = 0;
							int var31 = 0;
							if (arg0 != 0) {
								var30 = sinTable[arg0];
								var31 = cosTable[arg0];
							}

							for (int var32 = 0; var32 < numPoints; var32++) {
								int var33 = pointX[var32];
								int var34 = pointY[var32];
								int var35 = pointZ[var32];
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

								if (var23 || numT > 0) {
									vertexViewSpaceX[var32] = var37;
									vertexViewSpaceY[var32] = var39;
									vertexViewSpaceZ[var32] = var35;
								}
							}

							try {
								render2(var23, var24, arg8);
							} catch (Exception var41) {
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.a(ZZI)V")
	public final void render2(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < maxDepth; var4++) {
			tmpDepthFaceCount[var4] = 0;
		}

		for (int var5 = 0; var5 < numFaces; var5++) {
			if (faceRenderType == null || faceRenderType[var5] != -1) {
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
					if (arg1 && isMouseRoughlyInsideTriangle(mouseX, mouseY, vertexScreenY[var6], vertexScreenY[var7], vertexScreenY[var8], var9, var10, var11)) {
						pickedEntityTypecode[pickedCount++] = arg2;
						arg1 = false;
					}

					if ((vertexScreenY[var8] - vertexScreenY[var7]) * (var9 - var10) - (vertexScreenY[var6] - vertexScreenY[var7]) * (var11 - var10) > 0) {
						faceNearClipped[var5] = false;

						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix2D.sizeX && var10 <= Pix2D.sizeX && var11 <= Pix2D.sizeX) {
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
						render3(var16[var17]);
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
					render3(var31[var29++]);

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
					render3(var31[var29++]);

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
					render3(var31[var29++]);

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
					render3(var36[var37]);
				}
			}

			while (var33 != -1000) {
				render3(var31[var29++]);

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

	@ObfuscatedName("eb.h(I)V")
	public final void render3(int arg0) {
		if (faceNearClipped[arg0]) {
			render3ZClip(arg0);
		} else {
			int var2 = faceVertexA[arg0];
			int var3 = faceVertexB[arg0];
			int var4 = faceVertexC[arg0];
			Pix3D.hclip = faceClippedX[arg0];

			if (faceAlpha == null) {
				Pix3D.trans = 0;
			} else {
				Pix3D.trans = faceAlpha[arg0];
			}

			int var5;
			if (faceRenderType == null) {
				var5 = 0;
			} else {
				var5 = faceRenderType[arg0] & 0x3;
			}

			if (var5 == 0) {
				Pix3D.gouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourB[arg0], faceColourC[arg0]);
			} else if (var5 == 1) {
				Pix3D.flatTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], colourTable[faceColourA[arg0]]);
			} else if (var5 == 2) {
				int var6 = faceRenderType[arg0] >> 2;
				int var7 = faceTextureP[var6];
				int var8 = faceTextureM[var6];
				int var9 = faceTextureN[var6];
				Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourB[arg0], faceColourC[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], faceColour[arg0]);
			} else if (var5 == 3) {
				int var10 = faceRenderType[arg0] >> 2;
				int var11 = faceTextureP[var10];
				int var12 = faceTextureM[var10];
				int var13 = faceTextureN[var10];
				Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var11], vertexViewSpaceX[var12], vertexViewSpaceX[var13], vertexViewSpaceY[var11], vertexViewSpaceY[var12], vertexViewSpaceY[var13], vertexViewSpaceZ[var11], vertexViewSpaceZ[var12], vertexViewSpaceZ[var13], faceColour[arg0]);
			}
		}
	}

	@ObfuscatedName("eb.i(I)V")
	public final void render3ZClip(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
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
				int var14 = (50 - var8) * divTable2[var10 - var8];
				clippedX[var4] = (((vertexViewSpaceX[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourC[arg0] - var13) * var14 >> 16) + var13;
			}

			if (var9 >= 50) {
				int var15 = (50 - var8) * divTable2[var9 - var8];
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
				int var19 = (50 - var9) * divTable2[var8 - var9];
				clippedX[var4] = (((vertexViewSpaceX[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourA[arg0] - var18) * var19 >> 16) + var18;
			}

			if (var10 >= 50) {
				int var20 = (50 - var9) * divTable2[var10 - var9];
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
				int var24 = (50 - var10) * divTable2[var9 - var10];
				clippedX[var4] = (((vertexViewSpaceX[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				clippedColour[var4++] = ((faceColourB[arg0] - var23) * var24 >> 16) + var23;
			}

			if (var8 >= 50) {
				int var25 = (50 - var10) * divTable2[var8 - var10];
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
			Pix3D.hclip = false;
			if (var4 == 3) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}

				int var32;
				if (faceRenderType == null) {
					var32 = 0;
				} else {
					var32 = faceRenderType[arg0] & 0x3;
				}

				if (var32 == 0) {
					Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
				} else if (var32 == 1) {
					Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, colourTable[faceColourA[arg0]]);
				} else if (var32 == 2) {
					int var33 = faceRenderType[arg0] >> 2;
					int var34 = faceTextureP[var33];
					int var35 = faceTextureM[var33];
					int var36 = faceTextureN[var33];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceX[var36], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceY[var36], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], vertexViewSpaceZ[var36], faceColour[arg0]);
				} else if (var32 == 3) {
					int var37 = faceRenderType[arg0] >> 2;
					int var38 = faceTextureP[var37];
					int var39 = faceTextureM[var37];
					int var40 = faceTextureN[var37];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], faceColour[arg0]);
				}
			}

			if (var4 == 4) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX || clippedX[3] < 0 || clippedX[3] > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}

				int var41;
				if (faceRenderType == null) {
					var41 = 0;
				} else {
					var41 = faceRenderType[arg0] & 0x3;
				}

				if (var41 == 0) {
					Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
					Pix3D.gouraudTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
					return;
				}

				if (var41 == 1) {
					int var42 = colourTable[faceColourA[arg0]];
					Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var42);
					Pix3D.flatTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], var42);
					return;
				}

				if (var41 == 2) {
					int var43 = faceRenderType[arg0] >> 2;
					int var44 = faceTextureP[var43];
					int var45 = faceTextureM[var43];
					int var46 = faceTextureN[var43];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], faceColour[arg0]);
					Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], faceColour[arg0]);
					return;
				}

				if (var41 == 3) {
					int var47 = faceRenderType[arg0] >> 2;
					int var48 = faceTextureP[var47];
					int var49 = faceTextureM[var47];
					int var50 = faceTextureN[var47];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], faceColour[arg0]);
					Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], faceColour[arg0]);
				}
			}
		}
	}

	@ObfuscatedName("eb.a(IIIIIIII)Z")
	public final boolean isMouseRoughlyInsideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
