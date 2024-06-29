import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class732 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field8677;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lrd;[Lot;)V", line = 3)
    public dxVertexLayout(class549 arg0, class378[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field7735);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class378 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2285(true); var8++) {
                class91 var9 = var7.method2287(-22176, var8);
                if (class91.field1226 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class91.field1229 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class91.field1230 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class91.field1231 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class91.field1232 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class91.field1233 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class91.field1234 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field1227;
            }
        }
        var3.finish();
        this.field8677 = arg0.field7746.method4115(var3, null);
    }
}
