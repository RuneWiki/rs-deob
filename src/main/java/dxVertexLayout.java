import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class109 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3670;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lhb;[Lqp;)V")
    public dxVertexLayout(class343 arg0, class636[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field4603);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class636 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method3522(103); var8++) {
                class255 var9 = var7.method3521(var8, 98);
                byte var10;
                byte var11;
                int var12;
                if (class255.field3339 == var9) {
                    var10 = 2;
                    var11 = 0;
                    var12 = 0;
                } else if (class255.field3343 == var9) {
                    var12 = 0;
                    var10 = 2;
                    var11 = 3;
                } else if (class255.field3344 == var9) {
                    var11 = 10;
                    var12 = 0;
                    var10 = 4;
                } else if (class255.field3345 == var9) {
                    var12 = var4++;
                    var10 = 0;
                    var11 = 5;
                } else if (class255.field3346 == var9) {
                    var12 = var4++;
                    var10 = 1;
                    var11 = 5;
                } else if (class255.field3347 == var9) {
                    var10 = 2;
                    var11 = 5;
                    var12 = var4++;
                } else {
                    var11 = 5;
                    var10 = 3;
                    var12 = var4++;
                }
                var3.addElement(var5, var10, 0, var11, var12, var6);
                var6 += var9.field3333;
            }
        }
        var3.finish();
        this.field3670 = arg0.field4612.method2466(var3, null);
    }
}
