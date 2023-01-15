import {useQuery, useQueryClient} from "@tanstack/react-query";
import axios from 'axios';

const Home = () => {
    const queryResponse = useQuery(["stocks"], async () => {
        try {
            const response = await axios.get("/getStockBySymbol", {
                params: {
                    stockSymbol: "ibm"
                }
            });
            console.log(response)
            return response;
        } catch (e) {
            return e;
        }
    });

    return (
        <div>
            Home
        </div>
    )

}

export default Home;