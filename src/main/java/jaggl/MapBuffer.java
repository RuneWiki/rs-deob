package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {
   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "c",
      descriptor = "I"
   )
   private int field9575;

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 4
   )
   public final void method3733(byte[] arg0, int arg1, int arg2, int arg3) {
      if (~this.field9575 == -1) {
         throw new RuntimeException();
      } else {
         super.method3733(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "b",
      descriptor = "()Z",
      line = 15
   )
   public final boolean method4793() {
      return this.field9575 != 0;
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "()Z",
      line = 22
   )
   public final boolean method4794() {
      boolean var1 = true;
      if (~this.field9575 != -1) {
         var1 = OpenGL.glUnmapBufferARB(this.field9575);
         this.method5113(0L, 0);
         this.field9575 = 0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "(III)Z",
      line = 39
   )
   public final boolean method4795(int arg0, int arg1, int arg2) {
      if (~this.field9575 != -1) {
         return false;
      } else {
         long var4 = OpenGL.glMapBufferARB(arg0, arg2);
         if (~var4 == -1L) {
            return false;
         } else {
            this.method5113(var4, arg1);
            this.field9575 = arg0;
            return true;
         }
      }
   }
}
