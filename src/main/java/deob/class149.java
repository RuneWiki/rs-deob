package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("ea")
public class class149 extends class409 {

    @ObfuscatedName("ea.v")
    public boolean field1654;

    @ObfuscatedName("ea.c")
    public boolean field1659 = true;

    @ObfuscatedName("ea.i")
    public List field1653;

    @ObfuscatedName("ea.f")
    public int[] field1656;

    @ObfuscatedName("ea.b")
    public long field1657;

    @ObfuscatedName("ea.n")
    public String field1658 = null;

    @ObfuscatedName("ea.s")
    public byte field1655;

    @ObfuscatedName("ea.l")
    public byte field1660;

    static {
        new BitSet(65536);
    }

    public class149(class438 arg0) {
        this.method2835(arg0);
    }

    @ObfuscatedName("ea.v(B)[I")
    public int[] method2831() {
        if (this.field1656 == null) {
            String[] var1 = new String[this.field1653.size()];
            this.field1656 = new int[this.field1653.size()];
            int var2 = 0;
            while (var2 < this.field1653.size()) {
                var1[var2] = ((class131) this.field1653.get(var2)).field1528.method7525();
                this.field1656[var2] = var2++;
            }
            int[] var3 = this.field1656;
            class435.method6902(var1, var3, 0, var1.length - 1);
        }
        return this.field1656;
    }

    @ObfuscatedName("ea.c(Lec;B)V")
    public void method2833(class131 arg0) {
        this.field1653.add(arg0);
        this.field1656 = null;
    }

    @ObfuscatedName("ea.i(II)V")
    public void method2847(int arg0) {
        this.field1653.remove(arg0);
        this.field1656 = null;
    }

    @ObfuscatedName("ea.f(I)I")
    public int method2837() {
        return this.field1653.size();
    }

    @ObfuscatedName("ea.b(Ljava/lang/String;B)I")
    public int method2834(String arg0) {
        if (!this.field1659) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1653.size(); var2++) {
            if (((class131) this.field1653.get(var2)).field1528.method7528().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ea.n(Lpi;S)V")
    public void method2835(class438 arg0) {
        int var2 = arg0.method6971();
        if ((var2 & 0x1) != 0) {
            this.field1654 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1659 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6971();
        }
        this.field4410 = arg0.method7003();
        this.field1657 = arg0.method7003();
        this.field1658 = arg0.method6981();
        arg0.method6979();
        this.field1660 = arg0.method7093();
        this.field1655 = arg0.method7093();
        int var4 = arg0.method7148();
        if (var4 <= 0) {
            return;
        }
        this.field1653 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class131 var6 = new class131();
            if (this.field1654) {
                arg0.method7003();
            }
            if (this.field1659) {
                var6.field1528 = new class459(arg0.method6981());
            }
            var6.field1534 = arg0.method7093();
            var6.field1529 = arg0.method7148();
            if (var3 >= 3) {
                arg0.method6979();
            }
            this.field1653.add(var5, var6);
        }
    }
}
