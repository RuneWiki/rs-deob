package org.bouncycastle.crypto.tls;

public class SupplementalDataEntry {

    public int dataType;

    public byte[] data;

    public SupplementalDataEntry(int arg0, byte[] arg1) {
        this.dataType = arg0;
        this.data = arg1;
    }

    public int getDataType() {
        return this.dataType;
    }

    public byte[] getData() {
        return this.data;
    }
}
