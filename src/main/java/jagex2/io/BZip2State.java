package jagex2.io;

import deob.ObfuscatedName;

public class BZip2State {

	@ObfuscatedName("QPNUVGRI.a")
	public final int MTFA_SIZE = 4096;

	@ObfuscatedName("QPNUVGRI.b")
	public final int MTFL_SIZE = 16;

	@ObfuscatedName("QPNUVGRI.c")
	public final int BZ_MAX_ALPHA_SIZE = 258;

	@ObfuscatedName("QPNUVGRI.d")
	public final int BZ_MAX_CODE_LEN = 23;

	@ObfuscatedName("QPNUVGRI.e")
	public final int field1294 = 1;

	@ObfuscatedName("QPNUVGRI.f")
	public final int BZ_N_GROUPS = 6;

	@ObfuscatedName("QPNUVGRI.g")
	public final int BZ_G_SIZE = 50;

	@ObfuscatedName("QPNUVGRI.h")
	public final int field1297 = 4;

	@ObfuscatedName("QPNUVGRI.i")
	public final int BZ_MAX_SELECTORS = 18002;

	@ObfuscatedName("QPNUVGRI.D")
	public int[] unzftab = new int[256];

	@ObfuscatedName("QPNUVGRI.F")
	public int[] cftab = new int[257];

	@ObfuscatedName("QPNUVGRI.G")
	public int[] cftabCopy = new int[257];

	@ObfuscatedName("QPNUVGRI.J")
	public boolean[] inUse = new boolean[256];

	@ObfuscatedName("QPNUVGRI.K")
	public boolean[] inUse16 = new boolean[16];

	@ObfuscatedName("QPNUVGRI.L")
	public byte[] seqToUnseq = new byte[256];

	@ObfuscatedName("QPNUVGRI.M")
	public byte[] mtfa = new byte[4096];

	@ObfuscatedName("QPNUVGRI.N")
	public int[] mtfbase = new int[16];

	@ObfuscatedName("QPNUVGRI.O")
	public byte[] selector = new byte[18002];

	@ObfuscatedName("QPNUVGRI.P")
	public byte[] selectorMtf = new byte[18002];

	@ObfuscatedName("QPNUVGRI.Q")
	public byte[][] len = new byte[6][258];

	@ObfuscatedName("QPNUVGRI.R")
	public int[][] limit = new int[6][258];

	@ObfuscatedName("QPNUVGRI.S")
	public int[][] base = new int[6][258];

	@ObfuscatedName("QPNUVGRI.T")
	public int[][] perm = new int[6][258];

	@ObfuscatedName("QPNUVGRI.U")
	public int[] minLens = new int[6];

	@ObfuscatedName("QPNUVGRI.t")
	public byte state_out_ch;

	@ObfuscatedName("QPNUVGRI.k")
	public int next_in;

	@ObfuscatedName("QPNUVGRI.l")
	public int avail_in;

	@ObfuscatedName("QPNUVGRI.m")
	public int total_in_lo32;

	@ObfuscatedName("QPNUVGRI.n")
	public int total_in_hi32;

	@ObfuscatedName("QPNUVGRI.p")
	public int next_out;

	@ObfuscatedName("QPNUVGRI.q")
	public int avail_out;

	@ObfuscatedName("QPNUVGRI.r")
	public int total_out_lo32;

	@ObfuscatedName("QPNUVGRI.s")
	public int total_out_hi32;

	@ObfuscatedName("QPNUVGRI.u")
	public int state_out_len;

	@ObfuscatedName("QPNUVGRI.w")
	public int bsBuff;

	@ObfuscatedName("QPNUVGRI.x")
	public int bsLive;

	@ObfuscatedName("QPNUVGRI.y")
	public int blockSize100k;

	@ObfuscatedName("QPNUVGRI.z")
	public int currBlockNo;

	@ObfuscatedName("QPNUVGRI.A")
	public int origPtr;

	@ObfuscatedName("QPNUVGRI.B")
	public int tPos;

	@ObfuscatedName("QPNUVGRI.C")
	public int k0;

	@ObfuscatedName("QPNUVGRI.E")
	public int c_nblock_used;

	@ObfuscatedName("QPNUVGRI.I")
	public int nInUse;

	@ObfuscatedName("QPNUVGRI.V")
	public int save_nblock;

	@ObfuscatedName("QPNUVGRI.v")
	public boolean blockRandomized;

	@ObfuscatedName("QPNUVGRI.j")
	public byte[] stream;

	@ObfuscatedName("QPNUVGRI.o")
	public byte[] decompressed;

	@ObfuscatedName("QPNUVGRI.H")
	public static int[] tt;
}
