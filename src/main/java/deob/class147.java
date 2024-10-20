package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("eg")
public class class147 extends class392 {

    @ObfuscatedName("eg.c")
    public boolean field1664;

    @ObfuscatedName("eg.l")
    public boolean field1658 = true;

    @ObfuscatedName("eg.s")
    public List field1660;

    @ObfuscatedName("eg.e")
    public int[] field1665;

    @ObfuscatedName("eg.r")
    public long field1661;

    @ObfuscatedName("eg.o")
    public String field1662 = null;

    @ObfuscatedName("eg.i")
    public byte field1657;

    @ObfuscatedName("eg.w")
    public byte field1659;

    static {
        new BitSet(65536);
    }

    public class147(class421 arg0) {
        this.method2725(arg0);
    }

    @ObfuscatedName("eg.c(I)[I")
    public int[] method2713() {
        if (this.field1665 == null) {
            String[] var1 = new String[this.field1660.size()];
            this.field1665 = new int[this.field1660.size()];
            int var2 = 0;
            while (var2 < this.field1660.size()) {
                var1[var2] = ((class129) this.field1660.get(var2)).field1527.method7232();
                this.field1665[var2] = var2++;
            }
            int[] var3 = this.field1665;
            class418.method2297(var1, var3, 0, var1.length - 1);
        }
        return this.field1665;
    }

    @ObfuscatedName("eg.l(Ldc;B)V")
    public void method2728(class129 arg0) {
        this.field1660.add(arg0);
        this.field1665 = null;
    }

    @ObfuscatedName("eg.s(II)V")
    public void method2715(int arg0) {
        this.field1660.remove(arg0);
        this.field1665 = null;
    }

    @ObfuscatedName("eg.e(I)I")
    public int method2716() {
        return this.field1660.size();
    }

    @ObfuscatedName("eg.r(Ljava/lang/String;I)I")
    public int method2718(String arg0) {
        if (!this.field1658) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1660.size(); var2++) {
            if (((class129) this.field1660.get(var2)).field1527.method7231().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("eg.o(Lpi;I)V")
    public void method2725(class421 arg0) {
        int var2 = arg0.method6686();
        if ((var2 & 0x1) != 0) {
            this.field1664 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1658 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6686();
        }
        this.field4301 = arg0.method6670();
        this.field1661 = arg0.method6670();
        this.field1662 = arg0.method6674();
        arg0.method6672();
        this.field1659 = arg0.method6664();
        this.field1657 = arg0.method6664();
        int var4 = arg0.method6666();
        if (var4 <= 0) {
            return;
        }
        this.field1660 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class129 var6 = new class129();
            if (this.field1664) {
                arg0.method6670();
            }
            if (this.field1658) {
                var6.field1527 = new class442(arg0.method6674());
            }
            var6.field1528 = arg0.method6664();
            var6.field1525 = arg0.method6666();
            if (var3 >= 3) {
                arg0.method6672();
            }
            this.field1660.add(var5, var6);
        }
    }
}
