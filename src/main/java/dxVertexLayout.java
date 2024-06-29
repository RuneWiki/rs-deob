import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class401 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "l",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field4837;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Lvea;[Ljq;)V"
   )
   public dxVertexLayout(class287 arg0, class535[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field4009);
      int var4 = 0;

      for(int var5 = 0; ~var5 > ~arg1.length; ++var5) {
         int var6 = 0;
         class535 var7 = arg1[var5];

         for(int var8 = 0; ~var8 > ~var7.method4010((byte)7); ++var8) {
            class274 var9 = var7.method4006(var8, 0);
            if (class274.field3883 == var9) {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            } else if (class274.field3884 == var9) {
               var3.addElement(var5, 2, 0, 3, 0, var6);
            } else if (class274.field3885 != var9) {
               if (class274.field3886 == var9) {
                  var3.addElement(var5, 0, 0, 5, var4++, var6);
               } else if (class274.field3887 == var9) {
                  var3.addElement(var5, 1, 0, 5, var4++, var6);
               } else if (class274.field3888 == var9) {
                  var3.addElement(var5, 2, 0, 5, var4++, var6);
               } else if (class274.field3889 == var9) {
                  var3.addElement(var5, 3, 0, 5, var4++, var6);
               }
            } else {
               var3.addElement(var5, 4, 0, 10, 0, var6);
            }

            var6 += var9.field3881;
         }
      }

      var3.finish();
      this.field4837 = arg0.field4018.method3815(var3, (IDirect3DVertexDeclaration)null);
   }
}
