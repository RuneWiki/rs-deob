import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class547 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field7226;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lui;[Loh;)V")
    public dxVertexLayout(class130 arg0, class401[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field1669);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class401 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2368(-24476); var8++) {
                class102 var9 = var7.method2362((byte) -127, var8);
                int var10;
                byte var11;
                byte var12;
                if (class102.field1241 == var9) {
                    var10 = 0;
                    var11 = 0;
                    var12 = 2;
                } else if (class102.field1242 == var9) {
                    var10 = 0;
                    var11 = 3;
                    var12 = 2;
                } else if (class102.field1243 == var9) {
                    var10 = 0;
                    var11 = 10;
                    var12 = 4;
                } else if (class102.field1244 == var9) {
                    var10 = var4++;
                    var11 = 5;
                    var12 = 0;
                } else if (class102.field1245 == var9) {
                    var12 = 1;
                    var10 = var4++;
                    var11 = 5;
                } else if (class102.field1246 == var9) {
                    var10 = var4++;
                    var12 = 2;
                    var11 = 5;
                } else {
                    var10 = var4++;
                    var12 = 3;
                    var11 = 5;
                }
                var3.addElement(var5, var12, 0, var11, var10, var6);
                var6 += var9.field1233;
            }
        }
        var3.finish();
        this.field7226 = arg0.field1657.method3789(var3, null);
    }
}
