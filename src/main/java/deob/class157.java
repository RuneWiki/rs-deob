package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("fn")
public class class157 extends class433 {

    @ObfuscatedName("fn.h")
    public boolean field1802;

    @ObfuscatedName("fn.e")
    public boolean field1792 = true;

    @ObfuscatedName("fn.v")
    public List field1804;

    @ObfuscatedName("fn.x")
    public int[] field1794;

    @ObfuscatedName("fn.m")
    public long field1795;

    @ObfuscatedName("fn.q")
    public String field1796 = null;

    @ObfuscatedName("fn.f")
    public byte field1797;

    @ObfuscatedName("fn.r")
    public byte field1800;

    static {
        new BitSet(65536);
    }

    public class157(class467 arg0) {
        this.method3024(arg0);
    }

    @ObfuscatedName("fn.h(I)[I")
    public int[] method3019() {
        if (this.field1794 == null) {
            String[] var1 = new String[this.field1804.size()];
            this.field1794 = new int[this.field1804.size()];
            int var2 = 0;
            while (var2 < this.field1804.size()) {
                var1[var2] = ((class139) this.field1804.get(var2)).field1662.method8384();
                this.field1794[var2] = var2++;
            }
            Statics.method2123(var1, this.field1794);
        }
        return this.field1794;
    }

    @ObfuscatedName("fn.e(Lee;I)V")
    public void method3029(class139 arg0) {
        this.field1804.add(arg0);
        this.field1794 = null;
    }

    @ObfuscatedName("fn.v(II)V")
    public void method3021(int arg0) {
        this.field1804.remove(arg0);
        this.field1794 = null;
    }

    @ObfuscatedName("fn.x(I)I")
    public int method3022() {
        return this.field1804.size();
    }

    @ObfuscatedName("fn.m(Ljava/lang/String;I)I")
    public int method3023(String arg0) {
        if (!this.field1792) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1804.size(); var2++) {
            if (((class139) this.field1804.get(var2)).field1662.method8383().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fn.q(Lqy;B)V")
    public void method3024(class467 arg0) {
        int var2 = arg0.method7792();
        if ((var2 & 0x1) != 0) {
            this.field1802 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1792 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7792();
        }
        this.field4686 = arg0.method7958();
        this.field1795 = arg0.method7958();
        this.field1796 = arg0.method7801();
        arg0.method7799();
        this.field1800 = arg0.method7793();
        this.field1797 = arg0.method7793();
        int var4 = arg0.method7794();
        if (var4 <= 0) {
            return;
        }
        this.field1804 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class139 var6 = new class139();
            if (this.field1802) {
                arg0.method7958();
            }
            if (this.field1792) {
                var6.field1662 = new class490(arg0.method7801());
            }
            var6.field1665 = arg0.method7793();
            var6.field1664 = arg0.method7794();
            if (var3 >= 3) {
                arg0.method7799();
            }
            this.field1804.add(var5, var6);
        }
    }
}
