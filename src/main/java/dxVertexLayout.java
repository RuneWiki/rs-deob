import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class278 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3490;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Leda;[Luaa;)V", line = 3)
    public dxVertexLayout(class561 arg0, class436[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8018);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class436 var7 = arg1[var5];
            for (int var8 = 0; var7.method2504((byte) 84) > var8; var8++) {
                class615 var9 = var7.method2500(var8, 0);
                byte var10;
                int var11;
                byte var12;
                if (class615.field8653 == var9) {
                    var10 = 2;
                    var11 = 0;
                    var12 = 0;
                } else if (class615.field8658 == var9) {
                    var12 = 3;
                    var10 = 2;
                    var11 = 0;
                } else if (class615.field8663 == var9) {
                    var11 = 0;
                    var12 = 10;
                    var10 = 4;
                } else if (class615.field8664 == var9) {
                    var12 = 5;
                    var10 = 0;
                    var11 = var4++;
                } else if (class615.field8665 == var9) {
                    var10 = 1;
                    var12 = 5;
                    var11 = var4++;
                } else if (class615.field8666 == var9) {
                    var11 = var4++;
                    var10 = 2;
                    var12 = 5;
                } else {
                    var12 = 5;
                    var10 = 3;
                    var11 = var4++;
                }
                var3.addElement(var5, var10, 0, var12, var11, var6);
                var6 += var9.field8654;
            }
        }
        var3.finish();
        this.field3490 = arg0.field8021.method2530(var3, null);
    }
}
