package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/du")
public class class700 {
   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "b",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field10243 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10244;
   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "c",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10245;

   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "a",
      descriptor = "(Ljaclib/peer/PeerReference;I)V",
      line = 7
   )
   private final void method5103(PeerReference arg0, int arg1) {
      arg0.method5102(arg1 + -18281);
      if (this.field10245 == arg0) {
         this.field10245 = arg0.field10242;
      }

      if (arg1 != 18314) {
         this.method5103((PeerReference)null, -79);
      }

      if (this.field10244 == arg0) {
         this.field10244 = arg0.field10241;
      }

      if (arg0.field10241 != null) {
         arg0.field10241.field10242 = arg0.field10242;
      }

      if (arg0.field10242 != null) {
         arg0.field10242.field10241 = arg0.field10241;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   private final void method5104(int arg0) {
      if (arg0 != -17182) {
         this.method5103((PeerReference)null, -110);
      }

      while(true) {
         Reference var2 = this.field10243.poll();
         if (var2 == null) {
            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method5103(var3, 18314);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "a",
      descriptor = "(B)V",
      line = 57
   )
   public final void method5105(byte arg0) {
      this.method5104(-17182);

      while(this.field10245 != null) {
         this.method5103(this.field10245, 18314);
      }

      if (arg0 != -83) {
         this.field10245 = (PeerReference)null;
      }

      this.method5104(-17182);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "a",
      descriptor = "(BLjaclib/peer/PeerReference;)V",
      line = 71
   )
   public final void method5106(byte arg0, PeerReference arg1) {
      arg1.field10241 = null;
      arg1.field10242 = this.field10245;
      if (arg0 <= -85) {
         if (this.field10244 == null) {
            this.field10244 = arg1;
         } else {
            this.field10245.field10241 = arg1;
         }

         this.field10245 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/du",
      name = "b",
      descriptor = "(I)V",
      line = 88
   )
   public final void method5107(int arg0) {
      this.method5104(-17182);
      int var2 = -22 % ((21 - arg0) / 49);
   }
}
