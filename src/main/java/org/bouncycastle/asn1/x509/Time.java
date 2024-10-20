package org.bouncycastle.asn1.x509;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERUTCTime;

public class Time extends ASN1Object implements ASN1Choice {

    public ASN1Primitive time;

    public Date getDate() {
        try {
            return this.time instanceof ASN1UTCTime ? ((ASN1UTCTime) this.time).getAdjustedDate() : ((ASN1GeneralizedTime) this.time).getDate();
        } catch (ParseException var2) {
            throw new IllegalStateException("invalid date string: " + var2.getMessage());
        }
    }

    public Time(ASN1Primitive arg0) {
        if (!(arg0 instanceof ASN1UTCTime) && !(arg0 instanceof ASN1GeneralizedTime)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.time = arg0;
    }

    public Time(Date arg0) {
        SimpleTimeZone var2 = new SimpleTimeZone(0, "Z");
        SimpleDateFormat var3 = new SimpleDateFormat("yyyyMMddHHmmss");
        var3.setTimeZone(var2);
        String var4 = var3.format(arg0) + "Z";
        int var5 = Integer.parseInt(var4.substring(0, 4));
        if (var5 >= 1950 && var5 <= 2049) {
            this.time = new DERUTCTime(var4.substring(2));
        } else {
            this.time = new DERGeneralizedTime(var4);
        }
    }

    public Time(Date arg0, Locale arg1) {
        SimpleTimeZone var3 = new SimpleTimeZone(0, "Z");
        SimpleDateFormat var4 = new SimpleDateFormat("yyyyMMddHHmmss", arg1);
        var4.setTimeZone(var3);
        String var5 = var4.format(arg0) + "Z";
        int var6 = Integer.parseInt(var5.substring(0, 4));
        if (var6 >= 1950 && var6 <= 2049) {
            this.time = new DERUTCTime(var5.substring(2));
        } else {
            this.time = new DERGeneralizedTime(var5);
        }
    }

    public static Time getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof Time)) {
            return (Time) arg0;
        } else if (arg0 instanceof ASN1UTCTime) {
            return new Time((ASN1UTCTime) arg0);
        } else if (arg0 instanceof ASN1GeneralizedTime) {
            return new Time((ASN1GeneralizedTime) arg0);
        } else {
            throw new IllegalArgumentException("unknown object in factory: " + arg0.getClass().getName());
        }
    }

    public String getTime() {
        return this.time instanceof ASN1UTCTime ? ((ASN1UTCTime) this.time).getAdjustedTime() : ((ASN1GeneralizedTime) this.time).getTime();
    }

    public String toString() {
        return this.getTime();
    }

    public ASN1Primitive toASN1Primitive() {
        return this.time;
    }

    public static Time getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(arg0.getObject());
    }

    public String ach() {
        return this.getTime();
    }

    public String acg() {
        return this.getTime();
    }
}
