package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("nn")
public class class361 {

    @ObfuscatedName("nn.ai")
    public class436 field3813 = new class436();

    @ObfuscatedName("nn.ao")
    public class436 field3808 = new class436();

    @ObfuscatedName("nn.as")
    public boolean field3824 = false;

    @ObfuscatedName("nn.ay")
    public boolean field3816 = true;

    @ObfuscatedName("nn.aj")
    public int field3817 = 0;

    @ObfuscatedName("nn.av")
    public boolean field3815 = false;

    @ObfuscatedName("nn.aw")
    public int field3819 = 0;

    @ObfuscatedName("nn.an")
    public int field3825 = 0;

    @ObfuscatedName("nn.ak")
    public int field3831 = 0;

    @ObfuscatedName("nn.bn")
    public int field3822 = 0;

    @ObfuscatedName("nn.bh")
    public int field3823 = 0;

    @ObfuscatedName("nn.bd")
    public int field3834 = 0;

    @ObfuscatedName("nn.bx")
    public int field3835 = 0;

    @ObfuscatedName("nn.bf")
    public int field3826 = Integer.MAX_VALUE;

    @ObfuscatedName("nn.bm")
    public int field3827 = Integer.MAX_VALUE;

    @ObfuscatedName("nn.bs")
    public int field3828 = 0;

    @ObfuscatedName("nn.bw")
    public int field3829 = 0;

    @ObfuscatedName("nn.ba")
    public int field3830 = 0;

    @ObfuscatedName("nn.bj")
    public int field3818 = 0;

    @ObfuscatedName("nn.bp")
    public class353 field3832;

    @ObfuscatedName("nn.by")
    public class353 field3833;

    public class361() {
        this.field3813.method7520(1);
        this.field3808.method7520(1);
    }

    @ObfuscatedName("nn.ac(I)V")
    public void method6242() {
        this.field3817 = (this.field3817 + 1) % 60;
        if (this.field3835 > 0) {
            this.field3835--;
        }
    }

    @ObfuscatedName("nn.ae(ZI)Z")
    public boolean method6243(boolean arg0) {
        boolean var2 = arg0 && this.field3816;
        boolean var3 = this.field3824 != var2;
        this.field3824 = var2;
        if (!this.field3824) {
            this.method6267(this.field3822, this.field3822);
        }
        return var3;
    }

    @ObfuscatedName("nn.ag(ZS)V")
    public void method6244(boolean arg0) {
        this.field3816 = arg0;
        this.field3824 = arg0 && this.field3824;
    }

    @ObfuscatedName("nn.am(Ljava/lang/String;I)Z")
    public boolean method6521(String arg0) {
        String var2 = this.field3813.method7599();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method6311(arg0);
        this.field3813.method7582(var3);
        this.method6267(this.field3823, this.field3822);
        this.method6252(this.field3830, this.field3818);
        this.method6446();
        this.method6320();
        return true;
    }

    @ObfuscatedName("nn.ax(Ljava/lang/String;B)Z")
    public boolean method6423(String arg0) {
        this.field3808.method7582(arg0);
        return true;
    }

    @ObfuscatedName("nn.aq(Lqk;S)Z")
    public boolean method6382(class439 arg0) {
        boolean var2 = !this.field3815;
        this.field3813.method7519(arg0);
        this.field3808.method7519(arg0);
        this.field3815 = true;
        boolean var3 = var2 | this.method6252(this.field3830, this.field3818);
        boolean var4 = var3 | this.method6267(this.field3823, this.field3822);
        if (this.method6446()) {
            this.method6320();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("nn.af(IIB)Z")
    public boolean method6248(int arg0, int arg1) {
        boolean var3 = this.field3828 != arg0 || this.field3829 != arg1;
        this.field3828 = arg0;
        this.field3829 = arg1;
        return var3 | this.method6252(this.field3830, this.field3818);
    }

    @ObfuscatedName("nn.at(II)Z")
    public boolean method6415(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3813.method7538();
        this.field3813.method7516(arg0);
        this.field3808.method7516(arg0);
        if (this.method6446()) {
            this.method6320();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("nn.au(II)Z")
    public boolean method6250(int arg0) {
        this.field3813.method7517(arg0);
        if (this.method6446()) {
            this.method6320();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nn.ar(II)Z")
    public boolean method6285(int arg0) {
        this.field3827 = arg0;
        if (this.method6446()) {
            this.method6320();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nn.al(III)Z")
    public boolean method6252(int arg0, int arg1) {
        if (!this.method6299()) {
            this.field3830 = arg0;
            this.field3818 = arg1;
            return false;
        }
        int var3 = this.field3830;
        int var4 = this.field3818;
        int var5 = Math.max(0, this.field3813.method7533() - this.field3828 + 2);
        int var6 = Math.max(0, this.field3813.method7534() - this.field3829 + 1);
        this.field3830 = Math.max(0, Math.min(var5, arg0));
        this.field3818 = Math.max(0, Math.min(var6, arg1));
        return this.field3830 != var3 || this.field3818 != var4;
    }

    @ObfuscatedName("nn.ad(IIS)Z")
    public boolean method6253(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3813.method7521(arg0, arg1) : false;
    }

    @ObfuscatedName("nn.ah(IB)V")
    public void method6254(int arg0) {
        this.field3813.method7522(arg0);
    }

    @ObfuscatedName("nn.ap(II)V")
    public void method6507(int arg0) {
        this.field3819 = arg0;
    }

    @ObfuscatedName("nn.ab(IB)V")
    public void method6256(int arg0) {
        this.field3813.method7520(arg0);
    }

    @ObfuscatedName("nn.az(II)V")
    public void method6452(int arg0) {
        this.field3813.method7541(arg0);
    }

    @ObfuscatedName("nn.aa(II)Z")
    public boolean method6298(int arg0) {
        this.field3831 = arg0;
        String var2 = this.field3813.method7599();
        int var3 = var2.length();
        String var4 = this.method6311(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3813.method7582(var4);
        this.method6252(this.field3830, this.field3818);
        this.method6446();
        this.method6320();
        return true;
    }

    @ObfuscatedName("nn.ai(B)V")
    public void method6259() {
        this.field3815 = false;
    }

    @ObfuscatedName("nn.ao(II)Z")
    public boolean method6260(int arg0) {
        if (this.method6321(arg0)) {
            this.method6257();
            class437 var2 = this.field3813.method7524((char) arg0, this.field3822, this.field3826);
            this.method6267(var2.method7649(), var2.method7649());
            this.method6446();
            this.method6320();
        }
        return true;
    }

    @ObfuscatedName("nn.as(I)V")
    public void method6261() {
        if (!this.method6257() && this.field3822 > 0) {
            int var1 = this.field3813.method7544(this.field3822 - 1);
            this.method6320();
            this.method6267(var1, var1);
        }
    }

    @ObfuscatedName("nn.ay(I)V")
    public void method6371() {
        if (!this.method6257() && this.field3822 < this.field3813.method7577()) {
            int var1 = this.field3813.method7544(this.field3822);
            this.method6320();
            this.method6267(var1, var1);
        }
    }

    @ObfuscatedName("nn.aj(I)V")
    public void method6263() {
        if (!this.method6257() && this.field3822 > 0) {
            class521 var1 = this.method6313(this.field3822 - 1);
            int var2 = this.field3813.method7628((Integer) var1.field5265, this.field3822);
            this.method6320();
            this.method6267(var2, var2);
        }
    }

    @ObfuscatedName("nn.av(B)V")
    public void method6473() {
        if (!this.method6257() && this.field3822 < this.field3813.method7577()) {
            class521 var1 = this.method6313(this.field3822);
            int var2 = this.field3813.method7628(this.field3822, (Integer) var1.field5266);
            this.method6320();
            this.method6267(var2, var2);
        }
    }

    @ObfuscatedName("nn.aw(B)Z")
    public boolean method6257() {
        if (this.method6247()) {
            int var1 = this.field3813.method7628(this.field3823, this.field3822);
            this.method6320();
            this.method6267(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nn.an(I)V")
    public void method6358() {
        this.method6267(0, this.field3813.method7577());
    }

    @ObfuscatedName("nn.ak(III)Z")
    public boolean method6267(int arg0, int arg1) {
        if (!this.method6299()) {
            this.field3823 = arg0;
            this.field3822 = arg1;
            return false;
        }
        if (arg0 > this.field3813.method7577()) {
            arg0 = this.field3813.method7577();
        }
        if (arg1 > this.field3813.method7577()) {
            arg1 = this.field3813.method7577();
        }
        boolean var3 = this.field3823 != arg0 || this.field3822 != arg1;
        this.field3823 = arg0;
        if (this.field3822 != arg1) {
            this.field3822 = arg1;
            this.field3817 = 0;
            this.method6318();
        }
        if (var3 && this.field3833 != null) {
            this.field3833.method2825();
        }
        return var3;
    }

    @ObfuscatedName("nn.bn(ZI)V")
    public void method6268(boolean arg0) {
        class521 var2 = this.method6448(this.field3822);
        this.method6316((Integer) var2.field5265, arg0);
    }

    @ObfuscatedName("nn.bh(ZI)V")
    public void method6269(boolean arg0) {
        class521 var2 = this.method6448(this.field3822);
        this.method6316((Integer) var2.field5266, arg0);
    }

    @ObfuscatedName("nn.bd(ZI)V")
    public void method6409(boolean arg0) {
        this.method6316(0, arg0);
    }

    @ObfuscatedName("nn.bx(ZI)V")
    public void method6271(boolean arg0) {
        this.method6316(this.field3813.method7577(), arg0);
    }

    @ObfuscatedName("nn.bf(ZI)V")
    public void method6272(boolean arg0) {
        if (this.method6247() && !arg0) {
            this.method6316(Math.min(this.field3823, this.field3822), arg0);
        } else if (this.field3822 > 0) {
            this.method6316(this.field3822 - 1, arg0);
        }
    }

    @ObfuscatedName("nn.bm(ZI)V")
    public void method6460(boolean arg0) {
        if (this.method6247() && !arg0) {
            this.method6316(Math.max(this.field3823, this.field3822), arg0);
        } else if (this.field3822 < this.field3813.method7577()) {
            this.method6316(this.field3822 + 1, arg0);
        }
    }

    @ObfuscatedName("nn.bs(ZI)V")
    public void method6274(boolean arg0) {
        if (this.field3822 > 0) {
            class521 var2 = this.method6313(this.field3822 - 1);
            this.method6316((Integer) var2.field5265, arg0);
        }
    }

    @ObfuscatedName("nn.bw(ZB)V")
    public void method6275(boolean arg0) {
        if (this.field3822 < this.field3813.method7577()) {
            class521 var2 = this.method6313(this.field3822 + 1);
            this.method6316((Integer) var2.field5266, arg0);
        }
    }

    @ObfuscatedName("nn.ba(ZI)V")
    public void method6465(boolean arg0) {
        if (this.field3822 > 0) {
            this.method6316(this.field3813.method7532(this.field3822, -1), arg0);
        }
    }

    @ObfuscatedName("nn.bj(ZI)V")
    public void method6323(boolean arg0) {
        if (this.field3822 < this.field3813.method7577()) {
            this.method6316(this.field3813.method7532(this.field3822, 1), arg0);
        }
    }

    @ObfuscatedName("nn.bp(ZI)V")
    public void method6278(boolean arg0) {
        if (this.field3822 > 0) {
            int var2 = this.method6317();
            this.method6316(this.field3813.method7532(this.field3822, -var2), arg0);
        }
    }

    @ObfuscatedName("nn.by(ZB)V")
    public void method6279(boolean arg0) {
        if (this.field3822 < this.field3813.method7577()) {
            int var2 = this.method6317();
            this.method6316(this.field3813.method7532(this.field3822, var2), arg0);
        }
    }

    @ObfuscatedName("nn.bb(ZI)V")
    public void method6249(boolean arg0) {
        class440 var2 = this.field3813.method7523(0, this.field3822);
        class521 var3 = var2.method7776();
        this.method6316(this.field3813.method7531((Integer) var3.field5265, this.field3818), arg0);
    }

    @ObfuscatedName("nn.bi(ZI)V")
    public void method6281(boolean arg0) {
        class440 var2 = this.field3813.method7523(0, this.field3822);
        class521 var3 = var2.method7776();
        this.method6316(this.field3813.method7531((Integer) var3.field5265, this.field3829 + this.field3818), arg0);
    }

    @ObfuscatedName("nn.bg(IIZZI)V")
    public void method6345(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3815) {
            int var7 = this.field3830 + arg0;
            int var8 = this.field3818 + arg1;
            class521 var9 = this.method6322();
            var6 = this.field3813.method7531(var7 - (Integer) var9.field5265, var8 - (Integer) var9.field5266);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3825 = 1;
            class521 var10 = this.method6313(var6);
            class521 var11 = this.method6313(this.field3834);
            this.method6390(var11, var10);
        } else if (arg2) {
            this.field3825 = 1;
            class521 var12 = this.method6313(var6);
            this.method6267((Integer) var12.field5265, (Integer) var12.field5266);
            this.field3834 = (Integer) var12.field5265;
        } else if (arg3) {
            this.method6267(this.field3834, var6);
        } else {
            if (this.field3835 <= 0 || this.field3834 != var6) {
                this.field3825 = 0;
                this.method6267(var6, var6);
                this.field3834 = var6;
            } else if (this.field3823 == this.field3822) {
                this.field3825 = 1;
                class521 var13 = this.method6313(var6);
                this.method6267((Integer) var13.field5265, (Integer) var13.field5266);
            } else {
                this.field3825 = 2;
                class521 var14 = this.method6448(var6);
                this.method6267((Integer) var14.field5265, (Integer) var14.field5266);
            }
            this.field3835 = 25;
        }
    }

    @ObfuscatedName("nn.bl(IIB)V")
    public void method6283(int arg0, int arg1) {
        if (!this.field3815 || !this.method6294()) {
            return;
        }
        int var3 = this.field3830 + arg0;
        int var4 = this.field3818 + arg1;
        class521 var5 = this.method6322();
        int var6 = this.field3813.method7531(var3 - (Integer) var5.field5265, var4 - (Integer) var5.field5266);
        switch(this.field3825) {
            case 0:
                this.method6267(this.field3823, var6);
                break;
            case 1:
                class521 var9 = this.method6313(this.field3834);
                class521 var10 = this.method6313(var6);
                this.method6390(var9, var10);
                break;
            case 2:
                class521 var7 = this.method6448(this.field3834);
                class521 var8 = this.method6448(var6);
                this.method6390(var7, var8);
        }
    }

    @ObfuscatedName("nn.bz(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6284(Clipboard arg0) {
        class440 var2 = this.field3813.method7523(this.field3823, this.field3822);
        if (!var2.method7773()) {
            String var3 = var2.method7771();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("nn.bu(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6312(Clipboard arg0) {
        if (this.method6247()) {
            this.method6284(arg0);
            this.method6257();
        }
    }

    @ObfuscatedName("nn.br(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6286(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method6311((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method6257();
            class437 var4 = this.field3813.method7589(var3, this.field3822, this.field3826);
            this.method6267(var4.method7649(), var4.method7649());
            this.method6446();
            this.method6320();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("nn.bo(I)V")
    public void method6287() {
        this.field3818 = Math.max(0, this.field3818 - this.field3813.method7572());
    }

    @ObfuscatedName("nn.bv(B)V")
    public void method6288() {
        int var1 = Math.max(0, this.field3813.method7534() - this.field3829);
        this.field3818 = Math.min(var1, this.field3818 + this.field3813.method7572());
    }

    @ObfuscatedName("nn.bt(Lni;I)V")
    public void method6290(class353 arg0) {
        this.field3832 = arg0;
    }

    @ObfuscatedName("nn.bq(Lni;B)V")
    public void method6479(class353 arg0) {
        this.field3833 = arg0;
    }

    @ObfuscatedName("nn.bk(I)Lqn;")
    public class436 method6338() {
        return this.field3813;
    }

    @ObfuscatedName("nn.be(I)Lqn;")
    public class436 method6292() {
        return this.field3808;
    }

    @ObfuscatedName("nn.bc(B)Lqw;")
    public class440 method6293() {
        return this.field3813.method7523(this.field3823, this.field3822);
    }

    @ObfuscatedName("nn.cn(I)Z")
    public boolean method6294() {
        return this.field3824;
    }

    @ObfuscatedName("nn.ch(I)Z")
    public boolean method6295() {
        return this.field3816;
    }

    @ObfuscatedName("nn.cf(I)Z")
    public boolean method6296() {
        return this.method6294() && this.field3817 % 60 < 30;
    }

    @ObfuscatedName("nn.cu(I)I")
    public int method6297() {
        return this.field3822;
    }

    @ObfuscatedName("nn.cm(B)I")
    public int method6377() {
        return this.field3823;
    }

    @ObfuscatedName("nn.cj(I)Z")
    public boolean method6299() {
        return this.field3815;
    }

    @ObfuscatedName("nn.cx(I)I")
    public int method6300() {
        return this.field3830;
    }

    @ObfuscatedName("nn.ci(I)I")
    public int method6246() {
        return this.field3818;
    }

    @ObfuscatedName("nn.cy(I)I")
    public int method6413() {
        return this.field3813.method7538();
    }

    @ObfuscatedName("nn.co(I)I")
    public int method6303() {
        return this.field3813.method7539();
    }

    @ObfuscatedName("nn.cv(I)I")
    public int method6501() {
        return this.field3827;
    }

    @ObfuscatedName("nn.cg(I)I")
    public int method6305() {
        return this.field3819;
    }

    @ObfuscatedName("nn.ct(B)I")
    public int method6383() {
        return this.field3813.method7540();
    }

    @ObfuscatedName("nn.cq(I)I")
    public int method6307() {
        return this.field3831;
    }

    @ObfuscatedName("nn.cc(I)I")
    public int method6342() {
        return this.field3813.method7552();
    }

    @ObfuscatedName("nn.cz(S)Z")
    public boolean method6309() {
        return this.method6303() > 1;
    }

    @ObfuscatedName("nn.cw(B)Z")
    public boolean method6247() {
        return this.field3823 != this.field3822;
    }

    @ObfuscatedName("nn.cr(Ljava/lang/String;I)Ljava/lang/String;")
    public String method6311(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method6321(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("nn.cl(Lue;Lue;I)V")
    public void method6390(class521 arg0, class521 arg1) {
        if ((Integer) arg1.field5265 < (Integer) arg0.field5265) {
            this.method6267((Integer) arg0.field5266, (Integer) arg1.field5265);
        } else {
            this.method6267((Integer) arg0.field5265, (Integer) arg1.field5266);
        }
    }

    @ObfuscatedName("nn.ca(IS)Lue;")
    public class521 method6313(int arg0) {
        int var2 = this.field3813.method7577();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method6319(this.field3813.method7511(var5 - 1).field4795)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method6319(this.field3813.method7511(var6).field4795)) {
                var4 = var6;
                break;
            }
        }
        return new class521(var3, var4);
    }

    @ObfuscatedName("nn.cs(II)Lue;")
    public class521 method6448(int arg0) {
        int var2 = this.field3813.method7577();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3813.method7511(var5 - 1).field4795 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3813.method7511(var6).field4795 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class521(var3, var4);
    }

    @ObfuscatedName("nn.cp(I)Z")
    public boolean method6446() {
        if (!this.method6299()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3813.method7577() > this.field3827) {
            this.field3813.method7628(this.field3827, this.field3813.method7577());
            var1 = true;
        }
        int var2 = this.method6303();
        if (this.field3813.method7515() > var2) {
            int var3 = this.field3813.method7532(0, var2) - 1;
            this.field3813.method7628(var3, this.field3813.method7577());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3822;
            int var5 = this.field3823;
            int var6 = this.field3813.method7577();
            if (this.field3822 > var6) {
                var4 = var6;
            }
            if (this.field3823 > var6) {
                var5 = var6;
            }
            this.method6267(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("nn.cb(IZI)V")
    public void method6316(int arg0, boolean arg1) {
        if (arg1) {
            this.method6267(this.field3823, arg0);
        } else {
            this.method6267(arg0, arg0);
        }
    }

    @ObfuscatedName("nn.cd(B)I")
    public int method6317() {
        return this.field3829 / this.field3813.method7572();
    }

    @ObfuscatedName("nn.ce(B)V")
    public void method6318() {
        class440 var1 = this.field3813.method7523(0, this.field3822);
        class521 var2 = var1.method7776();
        int var3 = this.field3813.method7572();
        int var4 = (Integer) var2.field5265 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5266 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3830;
        int var9 = this.field3828 + var8;
        int var10 = this.field3818;
        int var11 = this.field3829 + var10;
        int var12 = this.field3830;
        int var13 = this.field3818;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3828;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3829;
        }
        this.method6252(var12, var13);
    }

    @ObfuscatedName("nn.ck(II)Z")
    public boolean method6319(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("nn.dp(B)V")
    public void method6320() {
        if (this.field3832 != null) {
            this.field3832.method2825();
        }
    }

    @ObfuscatedName("nn.df(IB)Z")
    public boolean method6321(int arg0) {
        switch(this.field3831) {
            case 1:
                return class419.method3257((char) arg0);
            case 2:
                return class419.method6160((char) arg0);
            case 3:
                return class419.method2557((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class419.method2557(var2)) {
                    return true;
                } else if (var2 == 'k' || var2 == 'K' || var2 == 'm' || var2 == 'M' || var2 == 'b' || var2 == 'B') {
                    return true;
                } else {
                    return false;
                }
            default:
                return true;
        }
    }

    @ObfuscatedName("nn.dv(I)Lue;")
    public class521 method6322() {
        int var1 = this.field3813.method7542(this.field3828);
        int var2 = this.field3813.method7543(this.field3829);
        return new class521(var1, var2);
    }
}
