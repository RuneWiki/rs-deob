package deob;

@ObfuscatedName("ce")
public class class86 {

    @ObfuscatedName("ce.j")
    public static int[] field1493 = new int[500];

    @ObfuscatedName("ce.y")
    public static int[] field1494 = new int[500];

    @ObfuscatedName("ce.z")
    public static int[] field1500 = new int[500];

    @ObfuscatedName("ce.l")
    public static int[] field1496 = new int[500];

    @ObfuscatedName("ce.w")
    public class100 field1497 = null;

    @ObfuscatedName("ce.d")
    public int field1501 = -1;

    @ObfuscatedName("ce.f")
    public int[] field1499;

    @ObfuscatedName("ce.i")
    public int[] field1495;

    @ObfuscatedName("ce.a")
    public int[] field1498;

    @ObfuscatedName("ce.o")
    public int[] field1502;

    @ObfuscatedName("ce.u")
    public boolean field1503 = false;

    public class86(byte[] arg0, class100 arg1) {
        this.field1497 = arg1;
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        var3.field1894 = 2;
        int var5 = var3.method2322();
        int var6 = -1;
        int var7 = 0;
        var4.field1894 = var3.field1894 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2322();
            if (var9 > 0) {
                if (this.field1497.field1709[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1497.field1709[var10] == 0) {
                            field1493[var7] = var10;
                            field1494[var7] = 0;
                            field1500[var7] = 0;
                            field1496[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1493[var7] = var8;
                short var11 = 0;
                if (this.field1497.field1709[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1494[var7] = var11;
                } else {
                    field1494[var7] = var4.method2473();
                }
                if ((var9 & 0x2) == 0) {
                    field1500[var7] = var11;
                } else {
                    field1500[var7] = var4.method2473();
                }
                if ((var9 & 0x4) == 0) {
                    field1496[var7] = var11;
                } else {
                    field1496[var7] = var4.method2473();
                }
                var6 = var8;
                var7++;
                if (this.field1497.field1709[var8] == 5) {
                    this.field1503 = true;
                }
            }
        }
        if (var4.field1894 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1501 = var7;
        this.field1499 = new int[var7];
        this.field1495 = new int[var7];
        this.field1498 = new int[var7];
        this.field1502 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1499[var12] = field1493[var12];
            this.field1495[var12] = field1494[var12];
            this.field1498[var12] = field1500[var12];
            this.field1502[var12] = field1496[var12];
        }
    }
}
