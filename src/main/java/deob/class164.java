package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gh")
public class class164 extends class474 {

    @ObfuscatedName("gh.aw")
    public boolean field1773;

    @ObfuscatedName("gh.ay")
    public boolean field1780 = true;

    @ObfuscatedName("gh.ar")
    public List field1775;

    @ObfuscatedName("gh.am")
    public int[] field1776;

    @ObfuscatedName("gh.as")
    public long field1774;

    @ObfuscatedName("gh.aj")
    public String field1778 = null;

    @ObfuscatedName("gh.ag")
    public byte field1779;

    @ObfuscatedName("gh.az")
    public byte field1781;

    static {
        new BitSet(65536);
    }

    public class164(class514 arg0) {
        this.method3088(arg0);
    }

    @ObfuscatedName("gh.aw(I)[I")
    public int[] method3085() {
        if (this.field1776 == null) {
            String[] var1 = new String[this.field1775.size()];
            this.field1776 = new int[this.field1775.size()];
            int var2 = 0;
            while (var2 < this.field1775.size()) {
                var1[var2] = ((class146) this.field1775.get(var2)).field1654.method8882();
                this.field1776[var2] = var2++;
            }
            int[] var3 = this.field1776;
            class511.method2302(var1, var3, 0, var1.length - 1);
        }
        return this.field1776;
    }

    @ObfuscatedName("gh.ay(Lfv;I)V")
    public void method3086(class146 arg0) {
        this.field1775.add(arg0);
        this.field1776 = null;
    }

    @ObfuscatedName("gh.ar(IB)V")
    public void method3087(int arg0) {
        this.field1775.remove(arg0);
        this.field1776 = null;
    }

    @ObfuscatedName("gh.am(I)I")
    public int method3105() {
        return this.field1775.size();
    }

    @ObfuscatedName("gh.as(Ljava/lang/String;I)I")
    public int method3092(String arg0) {
        if (!this.field1780) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1775.size(); var2++) {
            if (((class146) this.field1775.get(var2)).field1654.method8881().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gh.aj(Lty;I)V")
    public void method3088(class514 arg0) {
        int var2 = arg0.method8244();
        if ((var2 & 0x1) != 0) {
            this.field1773 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1780 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8244();
        }
        this.field4819 = arg0.method8251();
        this.field1774 = arg0.method8251();
        this.field1778 = arg0.method8369();
        arg0.method8253();
        this.field1781 = arg0.method8264();
        this.field1779 = arg0.method8264();
        int var4 = arg0.method8246();
        if (var4 <= 0) {
            return;
        }
        this.field1775 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class146 var6 = new class146();
            if (this.field1773) {
                arg0.method8251();
            }
            if (this.field1780) {
                var6.field1654 = new class538(arg0.method8369());
            }
            var6.field1656 = arg0.method8264();
            var6.field1653 = arg0.method8246();
            if (var3 >= 3) {
                arg0.method8253();
            }
            this.field1775.add(var5, var6);
        }
    }
}
