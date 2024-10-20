package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("er")
public class class150 extends class412 {

    @ObfuscatedName("er.c")
    public boolean field1709;

    @ObfuscatedName("er.p")
    public boolean field1703 = true;

    @ObfuscatedName("er.f")
    public List field1704;

    @ObfuscatedName("er.n")
    public int[] field1705;

    @ObfuscatedName("er.k")
    public long field1707;

    @ObfuscatedName("er.w")
    public String field1706 = null;

    @ObfuscatedName("er.s")
    public byte field1712;

    @ObfuscatedName("er.q")
    public byte field1710;

    static {
        new BitSet(65536);
    }

    public class150(class445 arg0) {
        this.method2971(arg0);
    }

    @ObfuscatedName("er.c(I)[I")
    public int[] method2966() {
        if (this.field1705 == null) {
            String[] var1 = new String[this.field1704.size()];
            this.field1705 = new int[this.field1704.size()];
            int var2 = 0;
            while (var2 < this.field1704.size()) {
                var1[var2] = ((class132) this.field1704.get(var2)).field1572.method7789();
                this.field1705[var2] = var2++;
            }
            class442.method2387(var1, this.field1705);
        }
        return this.field1705;
    }

    @ObfuscatedName("er.p(Lea;I)V")
    public void method2967(class132 arg0) {
        this.field1704.add(arg0);
        this.field1705 = null;
    }

    @ObfuscatedName("er.f(II)V")
    public void method2987(int arg0) {
        this.field1704.remove(arg0);
        this.field1705 = null;
    }

    @ObfuscatedName("er.n(I)I")
    public int method2969() {
        return this.field1704.size();
    }

    @ObfuscatedName("er.k(Ljava/lang/String;I)I")
    public int method2970(String arg0) {
        if (!this.field1703) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1704.size(); var2++) {
            if (((class132) this.field1704.get(var2)).field1572.method7774().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("er.w(Lqq;I)V")
    public void method2971(class445 arg0) {
        int var2 = arg0.method7196();
        if ((var2 & 0x1) != 0) {
            this.field1709 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1703 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7196();
        }
        this.field4504 = arg0.method7319();
        this.field1707 = arg0.method7319();
        this.field1706 = arg0.method7206();
        arg0.method7176();
        this.field1710 = arg0.method7197();
        this.field1712 = arg0.method7197();
        int var4 = arg0.method7198();
        if (var4 <= 0) {
            return;
        }
        this.field1704 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class132 var6 = new class132();
            if (this.field1709) {
                arg0.method7319();
            }
            if (this.field1703) {
                var6.field1572 = new class466(arg0.method7206());
            }
            var6.field1575 = arg0.method7197();
            var6.field1571 = arg0.method7198();
            if (var3 >= 3) {
                arg0.method7176();
            }
            this.field1704.add(var5, var6);
        }
    }
}
