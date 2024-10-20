package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface PKCSObjectIdentifiers {

    ASN1ObjectIdentifier pkcs_1 = new ASN1ObjectIdentifier("1.2.840.113549.1.1");

    ASN1ObjectIdentifier rsaEncryption = pkcs_1.branch("1");

    ASN1ObjectIdentifier md2WithRSAEncryption = pkcs_1.branch("2");

    ASN1ObjectIdentifier md4WithRSAEncryption = pkcs_1.branch("3");

    ASN1ObjectIdentifier md5WithRSAEncryption = pkcs_1.branch("4");

    ASN1ObjectIdentifier sha1WithRSAEncryption = pkcs_1.branch("5");

    ASN1ObjectIdentifier srsaOAEPEncryptionSET = pkcs_1.branch("6");

    ASN1ObjectIdentifier id_RSAES_OAEP = pkcs_1.branch("7");

    ASN1ObjectIdentifier id_mgf1 = pkcs_1.branch("8");

    ASN1ObjectIdentifier id_pSpecified = pkcs_1.branch("9");

    ASN1ObjectIdentifier id_RSASSA_PSS = pkcs_1.branch("10");

    ASN1ObjectIdentifier sha256WithRSAEncryption = pkcs_1.branch("11");

    ASN1ObjectIdentifier sha384WithRSAEncryption = pkcs_1.branch("12");

    ASN1ObjectIdentifier sha512WithRSAEncryption = pkcs_1.branch("13");

    ASN1ObjectIdentifier sha224WithRSAEncryption = pkcs_1.branch("14");

    ASN1ObjectIdentifier sha512_224WithRSAEncryption = pkcs_1.branch("15");

    ASN1ObjectIdentifier sha512_256WithRSAEncryption = pkcs_1.branch("16");

    ASN1ObjectIdentifier pkcs_3 = new ASN1ObjectIdentifier("1.2.840.113549.1.3");

    ASN1ObjectIdentifier dhKeyAgreement = pkcs_3.branch("1");

    ASN1ObjectIdentifier pkcs_5 = new ASN1ObjectIdentifier("1.2.840.113549.1.5");

    ASN1ObjectIdentifier pbeWithMD2AndDES_CBC = pkcs_5.branch("1");

    ASN1ObjectIdentifier pbeWithMD2AndRC2_CBC = pkcs_5.branch("4");

    ASN1ObjectIdentifier pbeWithMD5AndDES_CBC = pkcs_5.branch("3");

    ASN1ObjectIdentifier pbeWithMD5AndRC2_CBC = pkcs_5.branch("6");

    ASN1ObjectIdentifier pbeWithSHA1AndDES_CBC = pkcs_5.branch("10");

    ASN1ObjectIdentifier pbeWithSHA1AndRC2_CBC = pkcs_5.branch("11");

    ASN1ObjectIdentifier id_PBES2 = pkcs_5.branch("13");

    ASN1ObjectIdentifier id_PBKDF2 = pkcs_5.branch("12");

    ASN1ObjectIdentifier encryptionAlgorithm = new ASN1ObjectIdentifier("1.2.840.113549.3");

    ASN1ObjectIdentifier des_EDE3_CBC = encryptionAlgorithm.branch("7");

    ASN1ObjectIdentifier RC2_CBC = encryptionAlgorithm.branch("2");

    ASN1ObjectIdentifier rc4 = encryptionAlgorithm.branch("4");

    ASN1ObjectIdentifier digestAlgorithm = new ASN1ObjectIdentifier("1.2.840.113549.2");

    ASN1ObjectIdentifier md2 = digestAlgorithm.branch("2");

    ASN1ObjectIdentifier md4 = digestAlgorithm.branch("4");

    ASN1ObjectIdentifier md5 = digestAlgorithm.branch("5");

    ASN1ObjectIdentifier id_hmacWithSHA1 = digestAlgorithm.branch("7").intern();

    ASN1ObjectIdentifier id_hmacWithSHA224 = digestAlgorithm.branch("8").intern();

    ASN1ObjectIdentifier id_hmacWithSHA256 = digestAlgorithm.branch("9").intern();

    ASN1ObjectIdentifier id_hmacWithSHA384 = digestAlgorithm.branch("10").intern();

    ASN1ObjectIdentifier id_hmacWithSHA512 = digestAlgorithm.branch("11").intern();

    ASN1ObjectIdentifier pkcs_7 = (new ASN1ObjectIdentifier("1.2.840.113549.1.7")).intern();

    ASN1ObjectIdentifier data = (new ASN1ObjectIdentifier("1.2.840.113549.1.7.1")).intern();

    ASN1ObjectIdentifier signedData = (new ASN1ObjectIdentifier("1.2.840.113549.1.7.2")).intern();

    ASN1ObjectIdentifier envelopedData = (new ASN1ObjectIdentifier("1.2.840.113549.1.7.3")).intern();

    ASN1ObjectIdentifier signedAndEnvelopedData = (new ASN1ObjectIdentifier("1.2.840.113549.1.7.4")).intern();

    ASN1ObjectIdentifier digestedData = (new ASN1ObjectIdentifier("1.2.840.113549.1.7.5")).intern();

    ASN1ObjectIdentifier encryptedData = (new ASN1ObjectIdentifier("1.2.840.113549.1.7.6")).intern();

    ASN1ObjectIdentifier pkcs_9 = new ASN1ObjectIdentifier("1.2.840.113549.1.9");

    ASN1ObjectIdentifier pkcs_9_at_emailAddress = pkcs_9.branch("1").intern();

    ASN1ObjectIdentifier pkcs_9_at_unstructuredName = pkcs_9.branch("2").intern();

    ASN1ObjectIdentifier pkcs_9_at_contentType = pkcs_9.branch("3").intern();

    ASN1ObjectIdentifier pkcs_9_at_messageDigest = pkcs_9.branch("4").intern();

    ASN1ObjectIdentifier pkcs_9_at_signingTime = pkcs_9.branch("5").intern();

    ASN1ObjectIdentifier pkcs_9_at_counterSignature = pkcs_9.branch("6").intern();

    ASN1ObjectIdentifier pkcs_9_at_challengePassword = pkcs_9.branch("7").intern();

    ASN1ObjectIdentifier pkcs_9_at_unstructuredAddress = pkcs_9.branch("8").intern();

    ASN1ObjectIdentifier pkcs_9_at_extendedCertificateAttributes = pkcs_9.branch("9").intern();

    ASN1ObjectIdentifier pkcs_9_at_signingDescription = pkcs_9.branch("13").intern();

    ASN1ObjectIdentifier pkcs_9_at_extensionRequest = pkcs_9.branch("14").intern();

    ASN1ObjectIdentifier pkcs_9_at_smimeCapabilities = pkcs_9.branch("15").intern();

    ASN1ObjectIdentifier id_smime = pkcs_9.branch("16").intern();

    ASN1ObjectIdentifier pkcs_9_at_friendlyName = pkcs_9.branch("20").intern();

    ASN1ObjectIdentifier pkcs_9_at_localKeyId = pkcs_9.branch("21").intern();

    /**
     * @deprecated
     */
    ASN1ObjectIdentifier x509certType = pkcs_9.branch("22.1");

    ASN1ObjectIdentifier certTypes = pkcs_9.branch("22");

    ASN1ObjectIdentifier x509Certificate = certTypes.branch("1").intern();

    ASN1ObjectIdentifier sdsiCertificate = certTypes.branch("2").intern();

    ASN1ObjectIdentifier crlTypes = pkcs_9.branch("23");

    ASN1ObjectIdentifier x509Crl = crlTypes.branch("1").intern();

    ASN1ObjectIdentifier id_aa_cmsAlgorithmProtect = pkcs_9.branch("52").intern();

    ASN1ObjectIdentifier preferSignedData = pkcs_9.branch("15.1");

    ASN1ObjectIdentifier canNotDecryptAny = pkcs_9.branch("15.2");

    ASN1ObjectIdentifier sMIMECapabilitiesVersions = pkcs_9.branch("15.3");

    ASN1ObjectIdentifier id_ct = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.1");

    ASN1ObjectIdentifier id_ct_authData = id_ct.branch("2");

    ASN1ObjectIdentifier id_ct_TSTInfo = id_ct.branch("4");

    ASN1ObjectIdentifier id_ct_compressedData = id_ct.branch("9");

    ASN1ObjectIdentifier id_ct_authEnvelopedData = id_ct.branch("23");

    ASN1ObjectIdentifier id_ct_timestampedData = id_ct.branch("31");

    ASN1ObjectIdentifier id_alg = id_smime.branch("3");

    ASN1ObjectIdentifier id_alg_PWRI_KEK = id_alg.branch("9");

    ASN1ObjectIdentifier id_rsa_KEM = id_alg.branch("14");

    ASN1ObjectIdentifier id_cti = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.6");

    ASN1ObjectIdentifier id_cti_ets_proofOfOrigin = id_cti.branch("1");

    ASN1ObjectIdentifier id_cti_ets_proofOfReceipt = id_cti.branch("2");

    ASN1ObjectIdentifier id_cti_ets_proofOfDelivery = id_cti.branch("3");

    ASN1ObjectIdentifier id_cti_ets_proofOfSender = id_cti.branch("4");

    ASN1ObjectIdentifier id_cti_ets_proofOfApproval = id_cti.branch("5");

    ASN1ObjectIdentifier id_cti_ets_proofOfCreation = id_cti.branch("6");

    ASN1ObjectIdentifier id_aa = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.2");

    ASN1ObjectIdentifier id_aa_receiptRequest = id_aa.branch("1");

    ASN1ObjectIdentifier id_aa_contentHint = id_aa.branch("4");

    ASN1ObjectIdentifier id_aa_msgSigDigest = id_aa.branch("5");

    ASN1ObjectIdentifier id_aa_contentReference = id_aa.branch("10");

    ASN1ObjectIdentifier id_aa_encrypKeyPref = id_aa.branch("11");

    ASN1ObjectIdentifier id_aa_signingCertificate = id_aa.branch("12");

    ASN1ObjectIdentifier id_aa_signingCertificateV2 = id_aa.branch("47");

    ASN1ObjectIdentifier id_aa_contentIdentifier = id_aa.branch("7");

    ASN1ObjectIdentifier id_aa_signatureTimeStampToken = id_aa.branch("14");

    ASN1ObjectIdentifier id_aa_ets_sigPolicyId = id_aa.branch("15");

    ASN1ObjectIdentifier id_aa_ets_commitmentType = id_aa.branch("16");

    ASN1ObjectIdentifier id_aa_ets_signerLocation = id_aa.branch("17");

    ASN1ObjectIdentifier id_aa_ets_signerAttr = id_aa.branch("18");

    ASN1ObjectIdentifier id_aa_ets_otherSigCert = id_aa.branch("19");

    ASN1ObjectIdentifier id_aa_ets_contentTimestamp = id_aa.branch("20");

    ASN1ObjectIdentifier id_aa_ets_certificateRefs = id_aa.branch("21");

    ASN1ObjectIdentifier id_aa_ets_revocationRefs = id_aa.branch("22");

    ASN1ObjectIdentifier id_aa_ets_certValues = id_aa.branch("23");

    ASN1ObjectIdentifier id_aa_ets_revocationValues = id_aa.branch("24");

    ASN1ObjectIdentifier id_aa_ets_escTimeStamp = id_aa.branch("25");

    ASN1ObjectIdentifier id_aa_ets_certCRLTimestamp = id_aa.branch("26");

    ASN1ObjectIdentifier id_aa_ets_archiveTimestamp = id_aa.branch("27");

    /**
     * @deprecated
     */
    ASN1ObjectIdentifier id_aa_sigPolicyId = id_aa_ets_sigPolicyId;

    /**
     * @deprecated
     */
    ASN1ObjectIdentifier id_aa_commitmentType = id_aa_ets_commitmentType;

    /**
     * @deprecated
     */
    ASN1ObjectIdentifier id_aa_signerLocation = id_aa_ets_signerLocation;

    /**
     * @deprecated
     */
    ASN1ObjectIdentifier id_aa_otherSigCert = id_aa_ets_otherSigCert;

    ASN1ObjectIdentifier id_spq_ets_uri = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.5.1");

    ASN1ObjectIdentifier id_spq_ets_unotice = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.5.2");

    ASN1ObjectIdentifier pkcs_12 = new ASN1ObjectIdentifier("1.2.840.113549.1.12");

    ASN1ObjectIdentifier bagtypes = pkcs_12.branch("10.1");

    ASN1ObjectIdentifier keyBag = bagtypes.branch("1");

    ASN1ObjectIdentifier pkcs8ShroudedKeyBag = bagtypes.branch("2");

    ASN1ObjectIdentifier certBag = bagtypes.branch("3");

    ASN1ObjectIdentifier crlBag = bagtypes.branch("4");

    ASN1ObjectIdentifier secretBag = bagtypes.branch("5");

    ASN1ObjectIdentifier safeContentsBag = bagtypes.branch("6");

    ASN1ObjectIdentifier pkcs_12PbeIds = pkcs_12.branch("1");

    ASN1ObjectIdentifier pbeWithSHAAnd128BitRC4 = pkcs_12PbeIds.branch("1");

    ASN1ObjectIdentifier pbeWithSHAAnd40BitRC4 = pkcs_12PbeIds.branch("2");

    ASN1ObjectIdentifier pbeWithSHAAnd3_KeyTripleDES_CBC = pkcs_12PbeIds.branch("3");

    ASN1ObjectIdentifier pbeWithSHAAnd2_KeyTripleDES_CBC = pkcs_12PbeIds.branch("4");

    ASN1ObjectIdentifier pbeWithSHAAnd128BitRC2_CBC = pkcs_12PbeIds.branch("5");

    ASN1ObjectIdentifier pbeWithSHAAnd40BitRC2_CBC = pkcs_12PbeIds.branch("6");

    /**
     * @deprecated
     */
    ASN1ObjectIdentifier pbewithSHAAnd40BitRC2_CBC = pkcs_12PbeIds.branch("6");

    ASN1ObjectIdentifier id_alg_CMS3DESwrap = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.6");

    ASN1ObjectIdentifier id_alg_CMSRC2wrap = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.7");

    ASN1ObjectIdentifier id_alg_ESDH = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.5");

    ASN1ObjectIdentifier id_alg_SSDH = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.10");

    String id_spq = "1.2.840.113549.1.9.16.5";
}
