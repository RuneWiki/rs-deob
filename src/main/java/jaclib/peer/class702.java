package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pga")
public class class702 {
   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "a",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field10274 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "c",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10275;
   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10276;

   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "b",
      descriptor = "(I)V",
      line = 7
   )
   public final void method5121(int arg0) {
      this.method5125(1069);
      if (arg0 != -30274) {
         this.field10275 = (PeerReference)null;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "a",
      descriptor = "(Z)V",
      line = 18
   )
   public final void method5122(boolean arg0) {
      this.method5125(1069);
      if (!arg0) {
         this.method5123((byte)-17, (PeerReference)null);
      }

      while(this.field10276 != null) {
         this.method5124(95, this.field10276);
      }

      this.method5125(1069);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "a",
      descriptor = "(BLjaclib/peer/PeerReference;)V",
      line = 33
   )
   public final void method5123(byte arg0, PeerReference arg1) {
      arg1.field10272 = this.field10276;
      arg1.field10273 = null;
      if (this.field10275 != null) {
         this.field10276.field10273 = arg1;
      } else {
         this.field10275 = arg1;
      }

      this.field10276 = arg1;
      if (arg0 >= -33) {
         this.field10275 = (PeerReference)null;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "a",
      descriptor = "(ILjaclib/peer/PeerReference;)V",
      line = 50
   )
   private final void method5124(int arg0, PeerReference arg1) {
      arg1.method5119(0);
      if (this.field10276 == arg1) {
         this.field10276 = arg1.field10272;
      }

      if (arg0 <= 13) {
         this.field10275 = (PeerReference)null;
      }

      if (this.field10275 == arg1) {
         this.field10275 = arg1.field10273;
      }

      if (arg1.field10273 != null) {
         arg1.field10273.field10272 = arg1.field10272;
      }

      if (arg1.field10272 != null) {
         arg1.field10272.field10273 = arg1.field10273;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/pga",
      name = "a",
      descriptor = "(I)V",
      line = 76
   )
   private final void method5125(int arg0) {
      if (arg0 != 1069) {
         this.field10276 = (PeerReference)null;
      }

      while(true) {
         Reference var2 = this.field10274.poll();
         if (var2 == null) {
            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method5124(arg0 ^ 1118, var3);
      }
   }
}
