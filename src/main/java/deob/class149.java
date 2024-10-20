package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("ex")
public class class149 extends class410 {

    @ObfuscatedName("ex.c")
    public boolean field1690;

    @ObfuscatedName("ex.v")
    public boolean field1702 = true;

    @ObfuscatedName("ex.q")
    public List field1692;

    @ObfuscatedName("ex.f")
    public int[] field1693;

    @ObfuscatedName("ex.j")
    public long field1694;

    @ObfuscatedName("ex.e")
    public String field1695 = null;

    @ObfuscatedName("ex.g")
    public byte field1696;

    @ObfuscatedName("ex.w")
    public byte field1697;

    static {
        new BitSet(65536);
    }

    public class149(class443 arg0) {
        this.method2858(arg0);
    }

    @ObfuscatedName("ex.c(B)[I")
    public int[] method2835() {
        if (this.field1693 == null) {
            String[] var1 = new String[this.field1692.size()];
            this.field1693 = new int[this.field1692.size()];
            int var2 = 0;
            while (var2 < this.field1692.size()) {
                var1[var2] = ((class131) this.field1692.get(var2)).field1580.method7618();
                this.field1693[var2] = var2++;
            }
            class440.method5936(var1, this.field1693);
        }
        return this.field1693;
    }

    @ObfuscatedName("ex.v(Lew;I)V")
    public void method2834(class131 arg0) {
        this.field1692.add(arg0);
        this.field1693 = null;
    }

    @ObfuscatedName("ex.q(II)V")
    public void method2837(int arg0) {
        this.field1692.remove(arg0);
        this.field1693 = null;
    }

    @ObfuscatedName("ex.f(I)I")
    public int method2850() {
        return this.field1692.size();
    }

    @ObfuscatedName("ex.j(Ljava/lang/String;B)I")
    public int method2839(String arg0) {
        if (!this.field1702) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1692.size(); var2++) {
            if (((class131) this.field1692.get(var2)).field1580.method7617().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ex.e(Lqt;I)V")
    public void method2858(class443 arg0) {
        int var2 = arg0.method7047();
        if ((var2 & 0x1) != 0) {
            this.field1690 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1702 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7047();
        }
        this.field4462 = arg0.method7106();
        this.field1694 = arg0.method7106();
        this.field1695 = arg0.method7057();
        arg0.method7055();
        this.field1697 = arg0.method7048();
        this.field1696 = arg0.method7048();
        int var4 = arg0.method7049();
        if (var4 <= 0) {
            return;
        }
        this.field1692 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class131 var6 = new class131();
            if (this.field1690) {
                arg0.method7106();
            }
            if (this.field1702) {
                var6.field1580 = new class464(arg0.method7057());
            }
            var6.field1582 = arg0.method7048();
            var6.field1579 = arg0.method7049();
            if (var3 >= 3) {
                arg0.method7055();
            }
            this.field1692.add(var5, var6);
        }
    }
}
