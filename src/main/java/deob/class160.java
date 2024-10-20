package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gj")
public class class160 extends class449 {

    @ObfuscatedName("gj.af")
    public boolean field1776;

    @ObfuscatedName("gj.an")
    public boolean field1778 = true;

    @ObfuscatedName("gj.aw")
    public List field1770;

    @ObfuscatedName("gj.ac")
    public int[] field1771;

    @ObfuscatedName("gj.au")
    public long field1772;

    @ObfuscatedName("gj.ab")
    public String field1773 = null;

    @ObfuscatedName("gj.aq")
    public byte field1769;

    @ObfuscatedName("gj.al")
    public byte field1775;

    static {
        new BitSet(65536);
    }

    public class160(class489 arg0) {
        this.method3158(arg0);
    }

    @ObfuscatedName("gj.af(I)[I")
    public int[] method3163() {
        if (this.field1771 == null) {
            String[] var1 = new String[this.field1770.size()];
            this.field1771 = new int[this.field1770.size()];
            int var2 = 0;
            while (var2 < this.field1770.size()) {
                var1[var2] = ((class142) this.field1770.get(var2)).field1652.method8842();
                this.field1771[var2] = var2++;
            }
            int[] var3 = this.field1771;
            class486.method3034(var1, var3, 0, var1.length - 1);
        }
        return this.field1771;
    }

    @ObfuscatedName("gj.an(Lfz;I)V")
    public void method3170(class142 arg0) {
        this.field1770.add(arg0);
        this.field1771 = null;
    }

    @ObfuscatedName("gj.aw(IB)V")
    public void method3156(int arg0) {
        this.field1770.remove(arg0);
        this.field1771 = null;
    }

    @ObfuscatedName("gj.ac(I)I")
    public int method3155() {
        return this.field1770.size();
    }

    @ObfuscatedName("gj.au(Ljava/lang/String;I)I")
    public int method3154(String arg0) {
        if (!this.field1778) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1770.size(); var2++) {
            if (((class142) this.field1770.get(var2)).field1652.method8841().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gj.ab(Lsg;I)V")
    public void method3158(class489 arg0) {
        int var2 = arg0.method8248();
        if ((var2 & 0x1) != 0) {
            this.field1776 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1778 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8248();
        }
        this.field4745 = arg0.method8271();
        this.field1772 = arg0.method8271();
        this.field1773 = arg0.method8259();
        arg0.method8296();
        this.field1775 = arg0.method8249();
        this.field1769 = arg0.method8249();
        int var4 = arg0.method8250();
        if (var4 <= 0) {
            return;
        }
        this.field1770 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class142 var6 = new class142();
            if (this.field1776) {
                arg0.method8271();
            }
            if (this.field1778) {
                var6.field1652 = new class513(arg0.method8259());
            }
            var6.field1650 = arg0.method8249();
            var6.field1655 = arg0.method8250();
            if (var3 >= 3) {
                arg0.method8296();
            }
            this.field1770.add(var5, var6);
        }
    }
}
