import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class657 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "j", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field10278;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lcu;[Lit;)V")
    public dxVertexLayout(class287 arg0, class734[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3644);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class734 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method4105(-102); var8++) {
                class453 var9 = var7.method4111(var8, (byte) -87);
                if (class453.field6343 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class453.field6349 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class453.field6351 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class453.field6352 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class453.field6353 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class453.field6354 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class453.field6355 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field6346;
            }
        }
        var3.finish();
        this.field10278 = arg0.field3643.method4015(var3, null);
    }
}
