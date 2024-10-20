package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

public class ECDSASigner implements ECConstants, DSA {

    public final DSAKCalculator kCalculator;

    public SecureRandom random;

    public ECKeyParameters key;

    public BigInteger calculateE(BigInteger arg0, byte[] arg1) {
        int var3 = arg0.bitLength();
        int var4 = arg1.length * 8;
        BigInteger var5 = new BigInteger(1, arg1);
        if (var3 < var4) {
            var5 = var5.shiftRight(var4 - var3);
        }
        return var5;
    }

    public ECDSASigner(DSAKCalculator arg0) {
        this.kCalculator = arg0;
    }

    public void init(boolean arg0, CipherParameters arg1) {
        SecureRandom var3 = null;
        if (!arg0) {
            this.key = (ECPublicKeyParameters) arg1;
        } else if (arg1 instanceof ParametersWithRandom) {
            ParametersWithRandom var4 = (ParametersWithRandom) arg1;
            this.key = (ECPrivateKeyParameters) var4.getParameters();
            var3 = var4.getRandom();
        } else {
            this.key = (ECPrivateKeyParameters) arg1;
        }
        this.random = this.initSecureRandom(arg0 && !this.kCalculator.isDeterministic(), var3);
    }

    public BigInteger[] generateSignature(byte[] arg0) {
        ECDomainParameters var2 = this.key.getParameters();
        BigInteger var3 = var2.getN();
        BigInteger var4 = this.calculateE(var3, arg0);
        BigInteger var5 = ((ECPrivateKeyParameters) this.key).getD();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(var3, var5, arg0);
        } else {
            this.kCalculator.init(var3, this.random);
        }
        ECMultiplier var6 = this.createBasePointMultiplier();
        BigInteger var9;
        BigInteger var10;
        do {
            BigInteger var7;
            do {
                var7 = this.kCalculator.nextK();
                ECPoint var8 = var6.multiply(var2.getG(), var7).normalize();
                var9 = var8.getAffineXCoord().toBigInteger().mod(var3);
            } while (var9.equals(ZERO));
            var10 = var7.modInverse(var3).multiply(var4.add(var5.multiply(var9))).mod(var3);
        } while (var10.equals(ZERO));
        return new BigInteger[] { var9, var10 };
    }

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public SecureRandom initSecureRandom(boolean arg0, SecureRandom arg1) {
        return arg0 ? (arg1 == null ? new SecureRandom() : arg1) : null;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public boolean verifySignature(byte[] arg0, BigInteger arg1, BigInteger arg2) {
        ECDomainParameters var4 = this.key.getParameters();
        BigInteger var5 = var4.getN();
        BigInteger var6 = this.calculateE(var5, arg0);
        if (arg1.compareTo(ONE) < 0 || arg1.compareTo(var5) >= 0) {
            return false;
        } else if (arg2.compareTo(ONE) >= 0 && arg2.compareTo(var5) < 0) {
            BigInteger var7 = arg2.modInverse(var5);
            BigInteger var8 = var6.multiply(var7).mod(var5);
            BigInteger var9 = arg1.multiply(var7).mod(var5);
            ECPoint var10 = var4.getG();
            ECPoint var11 = ((ECPublicKeyParameters) this.key).getQ();
            ECPoint var12 = ECAlgorithms.sumOfTwoMultiplies(var10, var8, var11, var9);
            if (var12.isInfinity()) {
                return false;
            }
            ECCurve var13 = var12.getCurve();
            if (var13 != null) {
                BigInteger var14 = var13.getCofactor();
                if (var14 != null && var14.compareTo(EIGHT) <= 0) {
                    ECFieldElement var15 = this.getDenominator(var13.getCoordinateSystem(), var12);
                    if (var15 != null && !var15.isZero()) {
                        ECFieldElement var16 = var12.getXCoord();
                        while (var13.isValidFieldElement(arg1)) {
                            ECFieldElement var17 = var13.fromBigInteger(arg1).multiply(var15);
                            if (var17.equals(var16)) {
                                return true;
                            }
                            arg1 = arg1.add(var5);
                        }
                        return false;
                    }
                }
            }
            BigInteger var18 = var12.normalize().getAffineXCoord().toBigInteger().mod(var5);
            return var18.equals(arg1);
        } else {
            return false;
        }
    }

    public ECFieldElement getDenominator(int arg0, ECPoint arg1) {
        switch(arg0) {
            case 1:
            case 6:
            case 7:
                return arg1.getZCoord(0);
            case 2:
            case 3:
            case 4:
                return arg1.getZCoord(0).square();
            case 5:
            default:
                return null;
        }
    }
}
