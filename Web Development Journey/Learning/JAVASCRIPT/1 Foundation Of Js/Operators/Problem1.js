/*
      Problem : Give Discount based on age , gender for metro ticket.
            - females got 50% off
            - kids under 5 Years of age are free
            - kids up to 8 years have half ticket 
            - People over 65 years of age only pay 30% of the ticket
            - in case of multiple discounts max discount will apply.

*/


let age = 55;
let gender = 'female';

let ticket = 1000;


if (age <= 5) {
  ticket = 0;
  console.log(`Ticket is free due to age under 5 Years. \n Ticket Price : ${ticket}`)
} else if (gender === 'female') {
      ticket = ticket * (50/100);
      console.log(`you have got 50% off due to female candidate. \n Ticket Price : ${ticket}`)
} else if (gender === "male") {
      if(age<=8){
          ticket = ticket * (50/100);
          console.log( `You got half ticket due to age under 8 years. \n Ticket Price : ${ticket}`);
      }
      else if(age>=65){
        ticket = ticket - (ticket * (30/100))
        console.log( `You got 30% off due to age above 65 years. \n Ticket Price : ${ticket}`)
      } else{
          console.log(`you have to pay full ticket because you are a men \n Ticket Price : ${ticket}`);
      }
}












