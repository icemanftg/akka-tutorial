package ro.aburghelea.akka.message;

/**
 * @author <a href="mailto:alexandru.burghelea@endava.com">Alexandru BURGHELEA</a>
 * @since 6/5/2014
 */
public class InsertMessage extends Message {

    public InsertMessage(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return "InsertMessage{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }

}
