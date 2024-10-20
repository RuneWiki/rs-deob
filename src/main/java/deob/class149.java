package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("et")
public class class149 extends class411 {

    @ObfuscatedName("et.o")
    public boolean field1713;

    @ObfuscatedName("et.q")
    public boolean field1706 = true;

    @ObfuscatedName("et.l")
    public List field1708;

    @ObfuscatedName("et.k")
    public int[] field1714;

    @ObfuscatedName("et.a")
    public long field1710;

    @ObfuscatedName("et.m")
    public String field1711 = null;

    @ObfuscatedName("et.p")
    public byte field1712;

    @ObfuscatedName("et.s")
    public byte field1707;

    static {
        new BitSet(65536);
    }

    public class149(class440 arg0) {
        this.method2768(arg0);
    }

    @ObfuscatedName("et.o(B)[I")
    public int[] method2764() {
        if (this.field1714 == null) {
            String[] var1 = new String[this.field1708.size()];
            this.field1714 = new int[this.field1708.size()];
            int var2 = 0;
            while (var2 < this.field1708.size()) {
                var1[var2] = ((class131) this.field1708.get(var2)).field1583.method7510();
                this.field1714[var2] = var2++;
            }
            class437.method2486(var1, this.field1714);
        }
        return this.field1714;
    }

    @ObfuscatedName("et.q(Lem;I)V")
    public void method2777(class131 arg0) {
        this.field1708.add(arg0);
        this.field1714 = null;
    }

    @ObfuscatedName("et.l(II)V")
    public void method2765(int arg0) {
        this.field1708.remove(arg0);
        this.field1714 = null;
    }

    @ObfuscatedName("et.k(B)I")
    public int method2763() {
        return this.field1708.size();
    }

    @ObfuscatedName("et.a(Ljava/lang/String;I)I")
    public int method2781(String arg0) {
        if (!this.field1706) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1708.size(); var2++) {
            if (((class131) this.field1708.get(var2)).field1583.method7492().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("et.m(Lpx;I)V")
    public void method2768(class440 arg0) {
        int var2 = arg0.method7071();
        if ((var2 & 0x1) != 0) {
            this.field1713 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1706 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7071();
        }
        this.field4468 = arg0.method7014();
        this.field1710 = arg0.method7014();
        this.field1711 = arg0.method7044();
        arg0.method6901();
        this.field1707 = arg0.method7034();
        this.field1712 = arg0.method7034();
        int var4 = arg0.method7082();
        if (var4 <= 0) {
            return;
        }
        this.field1708 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class131 var6 = new class131();
            if (this.field1713) {
                arg0.method7014();
            }
            if (this.field1706) {
                var6.field1583 = new class461(arg0.method7044());
            }
            var6.field1587 = arg0.method7034();
            var6.field1586 = arg0.method7082();
            if (var3 >= 3) {
                arg0.method6901();
            }
            this.field1708.add(var5, var6);
        }
    }
}
