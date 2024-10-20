package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {

    public byte[] xBuf = new byte[8];

    public long[] W = new long[80];

    public int xBufOff;

    public static final long[] K = new long[] { 4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L };

    public static final int BYTE_LENGTH = 128;

    public int wOff;

    public long H1;

    public long H2;

    public long H3;

    public long H4;

    public long H5;

    public long H6;

    public long H7;

    public long H8;

    public long byteCount1;

    public long byteCount2;

    public long Sigma1(long arg0) {
        return (arg0 << 45 | arg0 >>> 19) ^ (arg0 << 3 | arg0 >>> 61) ^ arg0 >>> 6;
    }

    public LongDigest(LongDigest arg0) {
        this.copyIn(arg0);
    }

    public void copyIn(LongDigest arg0) {
        System.arraycopy(arg0.xBuf, 0, this.xBuf, 0, arg0.xBuf.length);
        this.xBufOff = arg0.xBufOff;
        this.byteCount1 = arg0.byteCount1;
        this.byteCount2 = arg0.byteCount2;
        this.H1 = arg0.H1;
        this.H2 = arg0.H2;
        this.H3 = arg0.H3;
        this.H4 = arg0.H4;
        this.H5 = arg0.H5;
        this.H6 = arg0.H6;
        this.H7 = arg0.H7;
        this.H8 = arg0.H8;
        System.arraycopy(arg0.W, 0, this.W, 0, arg0.W.length);
        this.wOff = arg0.wOff;
    }

    public void populateState(byte[] arg0) {
        System.arraycopy(this.xBuf, 0, arg0, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, arg0, 8);
        Pack.longToBigEndian(this.byteCount1, arg0, 12);
        Pack.longToBigEndian(this.byteCount2, arg0, 20);
        Pack.longToBigEndian(this.H1, arg0, 28);
        Pack.longToBigEndian(this.H2, arg0, 36);
        Pack.longToBigEndian(this.H3, arg0, 44);
        Pack.longToBigEndian(this.H4, arg0, 52);
        Pack.longToBigEndian(this.H5, arg0, 60);
        Pack.longToBigEndian(this.H6, arg0, 68);
        Pack.longToBigEndian(this.H7, arg0, 76);
        Pack.longToBigEndian(this.H8, arg0, 84);
        Pack.intToBigEndian(this.wOff, arg0, 92);
        for (int var2 = 0; var2 < this.wOff; var2++) {
            Pack.longToBigEndian(this.W[var2], arg0, var2 * 8 + 96);
        }
    }

    public void restoreState(byte[] arg0) {
        this.xBufOff = Pack.bigEndianToInt(arg0, 8);
        System.arraycopy(arg0, 0, this.xBuf, 0, this.xBufOff);
        this.byteCount1 = Pack.bigEndianToLong(arg0, 12);
        this.byteCount2 = Pack.bigEndianToLong(arg0, 20);
        this.H1 = Pack.bigEndianToLong(arg0, 28);
        this.H2 = Pack.bigEndianToLong(arg0, 36);
        this.H3 = Pack.bigEndianToLong(arg0, 44);
        this.H4 = Pack.bigEndianToLong(arg0, 52);
        this.H5 = Pack.bigEndianToLong(arg0, 60);
        this.H6 = Pack.bigEndianToLong(arg0, 68);
        this.H7 = Pack.bigEndianToLong(arg0, 76);
        this.H8 = Pack.bigEndianToLong(arg0, 84);
        this.wOff = Pack.bigEndianToInt(arg0, 92);
        for (int var2 = 0; var2 < this.wOff; var2++) {
            this.W[var2] = Pack.bigEndianToLong(arg0, var2 * 8 + 96);
        }
    }

    public int getEncodedStateSize() {
        return this.wOff * 8 + 96;
    }

    public void update(byte arg0) {
        this.xBuf[this.xBufOff++] = arg0;
        if (this.xBuf.length == this.xBufOff) {
            this.processWord(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        while (this.xBufOff != 0 && arg2 > 0) {
            this.update(arg0[arg1]);
            arg1++;
            arg2--;
        }
        while (arg2 > this.xBuf.length) {
            this.processWord(arg0, arg1);
            arg1 += this.xBuf.length;
            arg2 -= this.xBuf.length;
            this.byteCount1 += (long) this.xBuf.length;
        }
        while (arg2 > 0) {
            this.update(arg0[arg1]);
            arg1++;
            arg2--;
        }
    }

    public void finish() {
        this.adjustByteCounts();
        long var1 = this.byteCount1 << 3;
        long var3 = this.byteCount2;
        this.update((byte) -128);
        while (this.xBufOff != 0) {
            this.update((byte) 0);
        }
        this.processLength(var1, var3);
        this.processBlock();
    }

    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        this.xBufOff = 0;
        for (int var1 = 0; var1 < this.xBuf.length; var1++) {
            this.xBuf[var1] = 0;
        }
        this.wOff = 0;
        for (int var2 = 0; var2 != this.W.length; var2++) {
            this.W[var2] = 0L;
        }
    }

    public LongDigest() {
        this.xBufOff = 0;
        this.reset();
    }

    public void processWord(byte[] arg0, int arg1) {
        this.W[this.wOff] = Pack.bigEndianToLong(arg0, arg1);
        if (++this.wOff == 16) {
            this.processBlock();
        }
    }

    public void adjustByteCounts() {
        if (this.byteCount1 > 2305843009213693951L) {
            this.byteCount2 += this.byteCount1 >>> 61;
            this.byteCount1 &= 0x1FFFFFFFFFFFFFFFL;
        }
    }

    public void processLength(long arg0, long arg1) {
        if (this.wOff > 14) {
            this.processBlock();
        }
        this.W[14] = arg1;
        this.W[15] = arg0;
    }

    public void processBlock() {
        this.adjustByteCounts();
        for (int var1 = 16; var1 <= 79; var1++) {
            this.W[var1] = this.Sigma1(this.W[var1 - 2]) + this.W[var1 - 7] + this.Sigma0(this.W[var1 - 15]) + this.W[var1 - 16];
        }
        long var2 = this.H1;
        long var4 = this.H2;
        long var6 = this.H3;
        long var8 = this.H4;
        long var10 = this.H5;
        long var12 = this.H6;
        long var14 = this.H7;
        long var16 = this.H8;
        int var18 = 0;
        for (int var19 = 0; var19 < 10; var19++) {
            long var20 = var16 + this.Sum1(var10) + this.Ch(var10, var12, var14) + K[var18] + this.W[var18++];
            long var22 = var8 + var20;
            long var24 = var20 + this.Sum0(var2) + this.Maj(var2, var4, var6);
            long var26 = var14 + this.Sum1(var22) + this.Ch(var22, var10, var12) + K[var18] + this.W[var18++];
            long var28 = var6 + var26;
            long var30 = var26 + this.Sum0(var24) + this.Maj(var24, var2, var4);
            long var32 = var12 + this.Sum1(var28) + this.Ch(var28, var22, var10) + K[var18] + this.W[var18++];
            long var34 = var4 + var32;
            long var36 = var32 + this.Sum0(var30) + this.Maj(var30, var24, var2);
            long var38 = var10 + this.Sum1(var34) + this.Ch(var34, var28, var22) + K[var18] + this.W[var18++];
            long var40 = var2 + var38;
            long var42 = var38 + this.Sum0(var36) + this.Maj(var36, var30, var24);
            long var44 = var22 + this.Sum1(var40) + this.Ch(var40, var34, var28) + K[var18] + this.W[var18++];
            var16 = var24 + var44;
            var8 = var44 + this.Sum0(var42) + this.Maj(var42, var36, var30);
            long var46 = var28 + this.Sum1(var16) + this.Ch(var16, var40, var34) + K[var18] + this.W[var18++];
            var14 = var30 + var46;
            var6 = var46 + this.Sum0(var8) + this.Maj(var8, var42, var36);
            long var48 = var34 + this.Sum1(var14) + this.Ch(var14, var16, var40) + K[var18] + this.W[var18++];
            var12 = var36 + var48;
            var4 = var48 + this.Sum0(var6) + this.Maj(var6, var8, var42);
            long var50 = var40 + this.Sum1(var12) + this.Ch(var12, var14, var16) + K[var18] + this.W[var18++];
            var10 = var42 + var50;
            var2 = var50 + this.Sum0(var4) + this.Maj(var4, var6, var8);
        }
        this.H1 += var2;
        this.H2 += var4;
        this.H3 += var6;
        this.H4 += var8;
        this.H5 += var10;
        this.H6 += var12;
        this.H7 += var14;
        this.H8 += var16;
        this.wOff = 0;
        for (int var52 = 0; var52 < 16; var52++) {
            this.W[var52] = 0L;
        }
    }

    public long Ch(long arg0, long arg1, long arg2) {
        return arg0 & arg1 ^ ~arg0 & arg2;
    }

    public long Maj(long arg0, long arg1, long arg2) {
        return arg0 & arg1 ^ arg0 & arg2 ^ arg1 & arg2;
    }

    public long Sum1(long arg0) {
        return (arg0 << 50 | arg0 >>> 14) ^ (arg0 << 46 | arg0 >>> 18) ^ (arg0 << 23 | arg0 >>> 41);
    }

    public long Sigma0(long arg0) {
        return (arg0 << 63 | arg0 >>> 1) ^ (arg0 << 56 | arg0 >>> 8) ^ arg0 >>> 7;
    }

    public int getByteLength() {
        return 128;
    }

    public long Sum0(long arg0) {
        return (arg0 << 36 | arg0 >>> 28) ^ (arg0 << 30 | arg0 >>> 34) ^ (arg0 << 25 | arg0 >>> 39);
    }
}
