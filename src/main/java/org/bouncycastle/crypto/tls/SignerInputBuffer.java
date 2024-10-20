package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Signer;

public class SignerInputBuffer extends ByteArrayOutputStream {

    public void updateSigner(Signer arg0) {
        arg0.update(this.buf, 0, this.count);
    }
}
