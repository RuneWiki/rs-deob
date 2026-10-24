package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("sb")
public class BZip2State {

	@ObfuscatedName("sb.a")
	public final int MTFA_SIZE = 4096;

	@ObfuscatedName("sb.b")
	public final int MTFL_SIZE = 16;

	@ObfuscatedName("sb.c")
	public final int BZ_MAX_ALPHA_SIZE = 258;

	@ObfuscatedName("sb.d")
	public final int BZ_MAX_CODE_LEN = 23;

	@ObfuscatedName("sb.e")
	public final int BZ_RUNB = 1;

	@ObfuscatedName("sb.f")
	public final int BZ_N_GROUPS = 6;

	@ObfuscatedName("sb.g")
	public final int BZ_G_SIZE = 50;

	@ObfuscatedName("sb.h")
	public final int BZ_N_ITERS = 4;

	@ObfuscatedName("sb.i")
	public final int BZ_MAX_SELECTORS = 18002;

	@ObfuscatedName("sb.j")
	public byte[] stream;

	@ObfuscatedName("sb.k")
	public int next_in;

	@ObfuscatedName("sb.l")
	public int avail_in;

	@ObfuscatedName("sb.m")
	public int total_in_lo32;

	@ObfuscatedName("sb.n")
	public int total_in_hi32;

	@ObfuscatedName("sb.o")
	public byte[] decompressed;

	@ObfuscatedName("sb.p")
	public int next_out;

	@ObfuscatedName("sb.q")
	public int avail_out;

	@ObfuscatedName("sb.r")
	public int total_out_lo32;

	@ObfuscatedName("sb.s")
	public int total_out_hi32;

	@ObfuscatedName("sb.t")
	public byte state_out_ch;

	@ObfuscatedName("sb.u")
	public int state_out_len;

	@ObfuscatedName("sb.v")
	public boolean blockRandomised;

	@ObfuscatedName("sb.w")
	public int bsBuff;

	@ObfuscatedName("sb.x")
	public int bsLive;

	@ObfuscatedName("sb.y")
	public int blockSize100k;

	@ObfuscatedName("sb.z")
	public int currBlockNo;

	@ObfuscatedName("sb.D")
	public int[] unzftab = new int[256];

	@ObfuscatedName("sb.F")
	public int[] cftab = new int[257];

	@ObfuscatedName("sb.G")
	public int[] cftabCopy = new int[257];

	@ObfuscatedName("sb.J")
	public boolean[] inUse = new boolean[256];

	@ObfuscatedName("sb.K")
	public boolean[] inUse16 = new boolean[16];

	@ObfuscatedName("sb.L")
	public byte[] seqToUnseq = new byte[256];

	@ObfuscatedName("sb.M")
	public byte[] mtfa = new byte[4096];

	@ObfuscatedName("sb.N")
	public int[] mtfbase = new int[16];

	@ObfuscatedName("sb.O")
	public byte[] selector = new byte[18002];

	@ObfuscatedName("sb.P")
	public byte[] selectorMtf = new byte[18002];

	@ObfuscatedName("sb.Q")
	public byte[][] len = new byte[6][258];

	@ObfuscatedName("sb.R")
	public int[][] limit = new int[6][258];

	@ObfuscatedName("sb.S")
	public int[][] base = new int[6][258];

	@ObfuscatedName("sb.T")
	public int[][] perm = new int[6][258];

	@ObfuscatedName("sb.U")
	public int[] minLens = new int[6];

	@ObfuscatedName("sb.A")
	public int origPtr;

	@ObfuscatedName("sb.B")
	public int tPos;

	@ObfuscatedName("sb.C")
	public int k0;

	@ObfuscatedName("sb.E")
	public int nblock_used;

	@ObfuscatedName("sb.I")
	public int nInUse;

	@ObfuscatedName("sb.V")
	public int save_nblock;

	@ObfuscatedName("sb.H")
	public static int[] tt;
}
