package deob;

@ObfuscatedName("ho")
public class class211 {

    @ObfuscatedName("ho.h")
    public static int[] field2455 = new int[500];

    @ObfuscatedName("ho.e")
    public static int[] field2449 = new int[500];

    @ObfuscatedName("ho.v")
    public static int[] field2450 = new int[500];

    @ObfuscatedName("ho.x")
    public static int[] field2451 = new int[500];

    @ObfuscatedName("ho.m")
    public class215 field2452 = null;

    @ObfuscatedName("ho.q")
    public int field2453 = -1;

    @ObfuscatedName("ho.f")
    public int[] field2454;

    @ObfuscatedName("ho.r")
    public int[] field2448;

    @ObfuscatedName("ho.u")
    public int[] field2456;

    @ObfuscatedName("ho.b")
    public int[] field2457;

    @ObfuscatedName("ho.j")
    public boolean field2458 = false;

    public class211(byte[] arg0, class215 arg1) {
        this.field2452 = arg1;
        class467 var3 = new class467(arg0);
        class467 var4 = new class467(arg0);
        var3.field4915 = 2;
        int var5 = var3.method7792();
        int var6 = -1;
        int var7 = 0;
        var4.field4915 = var3.field4915 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7792();
            if (var9 > 0) {
                if (this.field2452.field2524[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2452.field2524[var10] == 0) {
                            field2455[var7] = var10;
                            field2449[var7] = 0;
                            field2450[var7] = 0;
                            field2451[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2455[var7] = var8;
                short var11 = 0;
                if (this.field2452.field2524[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2449[var7] = var11;
                } else {
                    field2449[var7] = var4.method7805();
                }
                if ((var9 & 0x2) == 0) {
                    field2450[var7] = var11;
                } else {
                    field2450[var7] = var4.method7805();
                }
                if ((var9 & 0x4) == 0) {
                    field2451[var7] = var11;
                } else {
                    field2451[var7] = var4.method7805();
                }
                var6 = var8;
                var7++;
                if (this.field2452.field2524[var8] == 5) {
                    this.field2458 = true;
                }
            }
        }
        if (var4.field4915 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2453 = var7;
        this.field2454 = new int[var7];
        this.field2448 = new int[var7];
        this.field2456 = new int[var7];
        this.field2457 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2454[var12] = field2455[var12];
            this.field2448[var12] = field2449[var12];
            this.field2456[var12] = field2450[var12];
            this.field2457[var12] = field2451[var12];
        }
    }
}
