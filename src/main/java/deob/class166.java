package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gb")
public class class166 extends class488 {

    @ObfuscatedName("gb.ac")
    public boolean field1774;

    @ObfuscatedName("gb.al")
    public boolean field1773 = true;

    @ObfuscatedName("gb.ak")
    public List field1772;

    @ObfuscatedName("gb.ax")
    public int[] field1777;

    @ObfuscatedName("gb.ao")
    public long field1776;

    @ObfuscatedName("gb.ah")
    public String field1775 = null;

    @ObfuscatedName("gb.ar")
    public byte field1778;

    @ObfuscatedName("gb.ab")
    public byte field1779;

    static {
        new BitSet(65536);
    }

    public class166(class530 arg0) {
        this.method3126(arg0);
    }

    @ObfuscatedName("gb.ac(B)[I")
    public int[] method3117() {
        if (this.field1777 == null) {
            String[] var1 = new String[this.field1772.size()];
            this.field1777 = new int[this.field1772.size()];
            int var2 = 0;
            while (var2 < this.field1772.size()) {
                var1[var2] = ((class148) this.field1772.get(var2)).field1660.method8986();
                this.field1777[var2] = var2++;
            }
            int[] var3 = this.field1777;
            Statics.method3098(var1, var3, 0, var1.length - 1);
        }
        return this.field1777;
    }

    @ObfuscatedName("gb.al(Lfv;B)V")
    public void method3118(class148 arg0) {
        this.field1772.add(arg0);
        this.field1777 = null;
    }

    @ObfuscatedName("gb.ak(IB)V")
    public void method3119(int arg0) {
        this.field1772.remove(arg0);
        this.field1777 = null;
    }

    @ObfuscatedName("gb.ax(I)I")
    public int method3120() {
        return this.field1772.size();
    }

    @ObfuscatedName("gb.ao(Ljava/lang/String;I)I")
    public int method3121(String arg0) {
        if (!this.field1773) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1772.size(); var2++) {
            if (((class148) this.field1772.get(var2)).field1660.method8985().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gb.ah(Lul;I)V")
    public void method3126(class530 arg0) {
        int var2 = arg0.method8365();
        if ((var2 & 0x1) != 0) {
            this.field1774 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1773 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8365();
        }
        this.field4857 = arg0.method8573();
        this.field1776 = arg0.method8573();
        this.field1775 = arg0.method8588();
        arg0.method8577();
        this.field1779 = arg0.method8366();
        this.field1778 = arg0.method8366();
        int var4 = arg0.method8598();
        if (var4 <= 0) {
            return;
        }
        this.field1772 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class148 var6 = new class148();
            if (this.field1774) {
                arg0.method8573();
            }
            if (this.field1773) {
                var6.field1660 = new class553(arg0.method8588());
            }
            var6.field1657 = arg0.method8366();
            var6.field1658 = arg0.method8598();
            if (var3 >= 3) {
                arg0.method8577();
            }
            this.field1772.add(var5, var6);
        }
    }
}
