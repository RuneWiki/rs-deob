package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gv")
public class class163 extends class461 {

    @ObfuscatedName("gv.at")
    public boolean field1761;

    @ObfuscatedName("gv.an")
    public boolean field1766 = true;

    @ObfuscatedName("gv.av")
    public List field1763;

    @ObfuscatedName("gv.as")
    public int[] field1764;

    @ObfuscatedName("gv.ax")
    public long field1765;

    @ObfuscatedName("gv.ap")
    public String field1762 = null;

    @ObfuscatedName("gv.ab")
    public byte field1767;

    @ObfuscatedName("gv.ak")
    public byte field1768;

    static {
        new BitSet(65536);
    }

    public class163(class501 arg0) {
        this.method3068(arg0);
    }

    @ObfuscatedName("gv.at(B)[I")
    public int[] method3064() {
        if (this.field1764 == null) {
            String[] var1 = new String[this.field1763.size()];
            this.field1764 = new int[this.field1763.size()];
            int var2 = 0;
            while (var2 < this.field1763.size()) {
                var1[var2] = ((class145) this.field1763.get(var2)).field1632.method8758();
                this.field1764[var2] = var2++;
            }
            int[] var3 = this.field1764;
            class498.method3695(var1, var3, 0, var1.length - 1);
        }
        return this.field1764;
    }

    @ObfuscatedName("gv.an(Lfr;B)V")
    public void method3065(class145 arg0) {
        this.field1763.add(arg0);
        this.field1764 = null;
    }

    @ObfuscatedName("gv.av(II)V")
    public void method3066(int arg0) {
        this.field1763.remove(arg0);
        this.field1764 = null;
    }

    @ObfuscatedName("gv.as(I)I")
    public int method3075() {
        return this.field1763.size();
    }

    @ObfuscatedName("gv.ax(Ljava/lang/String;B)I")
    public int method3067(String arg0) {
        if (!this.field1766) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1763.size(); var2++) {
            if (((class145) this.field1763.get(var2)).field1632.method8756().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gv.ap(Ltz;I)V")
    public void method3068(class501 arg0) {
        int var2 = arg0.method8129();
        if ((var2 & 0x1) != 0) {
            this.field1761 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1766 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8129();
        }
        this.field4757 = arg0.method8135();
        this.field1765 = arg0.method8135();
        this.field1762 = arg0.method8253();
        arg0.method8137();
        this.field1768 = arg0.method8130();
        this.field1767 = arg0.method8130();
        int var4 = arg0.method8195();
        if (var4 <= 0) {
            return;
        }
        this.field1763 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class145 var6 = new class145();
            if (this.field1761) {
                arg0.method8135();
            }
            if (this.field1766) {
                var6.field1632 = new class525(arg0.method8253());
            }
            var6.field1635 = arg0.method8130();
            var6.field1631 = arg0.method8195();
            if (var3 >= 3) {
                arg0.method8137();
            }
            this.field1763.add(var5, var6);
        }
    }
}
